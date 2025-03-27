package com.supriya;
import java.util.concurrent.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SalesController {

	private final RestTemplate restTemplate = new RestTemplate();
	private final ExecutorService executorService = Executors.newCachedThreadPool();
	@Autowired
	SalesService s;
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	@GetMapping("/posts")
    public ResponseEntity<String> getPosts() {
        String apiUrl = "https://jsonplaceholder.typicode.com/posts";
        String res=restTemplate.getForObject(apiUrl, String.class);
        return new ResponseEntity<String>(res,HttpStatus.OK);
    }
	
	 /* @GetMapping("/combined-data")
	    public ResponseEntity<String> getCombinedData() {
	        CompletableFuture<ResponseEntity<String>> postsFuture = CompletableFuture.supplyAsync(
	                () -> restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", String.class), executorService);

	        CompletableFuture<ResponseEntity<String>> usersFuture = CompletableFuture.supplyAsync(
	                () -> restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", String.class), executorService);

	        try {
	            ResponseEntity<String> postsResponse = postsFuture.join();
	            ResponseEntity<String> usersResponse = usersFuture.join();

	            String combinedResponse = "{\"posts\":" + postsResponse.getBody() + ", \"users\":" + usersResponse.getBody() + "}";

	            return ResponseEntity.ok(combinedResponse);
	        } catch (Exception e) {
	            return ResponseEntity.internalServerError().build();
	        }
	    }*/
	 
	  
	  @GetMapping("/non-blocking-task")
	    public ResponseEntity<String> performNonBlockingTask() {
	        s.fetchPosts();
	        s.fetchUsers();
	        /*s.fetchUser1();
	        s.fetchUser2();
	        s.fetchUser3();
	        s.fetchUser4();
	        s.fetchUsers5();
	        s.fetchUser6();
	        s.fetchUser7();
	        s.fetchUser8();
	        s.fetchUser9();
	        s.fetchUser10();
	        s.fetchUser11();*/

	        // Main thread does some work while API calls run asynchronously
	        String mainThreadTask = "Main thread did some quick processing!";
	        System.out.println(mainThreadTask+Thread.currentThread().getName());

	        return ResponseEntity.ok("APIs called asynchronously! " + mainThreadTask);
	    }
	      
	      @Autowired
	      private FactoryRepository factoryRepository;
	      
	      @PostMapping("/save")
	      public Factory saveFactory(@RequestBody Factory factory) {
	    	  for (Product product : factory.getProducts()) {
	              product.setFactory(factory); // Set Factory reference in Product
	          }
	          return factoryRepository.save(factory);
	      }
	      @PutMapping("/saveput")
	      public Factory saveputFactory(@RequestBody Factory factory) {
	    	  for (Product product : factory.getProducts()) {
	              product.setFactory(factory); // Set Factory reference in Product
	          }
	          return factoryRepository.save(factory);
	      }
}


