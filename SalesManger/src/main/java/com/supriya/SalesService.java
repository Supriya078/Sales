package com.supriya;

import java.util.concurrent.CompletableFuture;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SalesService {
	private final RestTemplate restTemplate = new RestTemplate();
	 
	    public CompletableFuture<ResponseEntity<String>> fetchPosts() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/posts";
	        System.out.println("posts "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }

	    public CompletableFuture<ResponseEntity<String>> fetchUsers() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser1() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser2() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser3() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser4() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUsers5() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser6() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser7() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser8() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser9() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	    @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser10() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }
	   /* @Async
	    public CompletableFuture<ResponseEntity<String>> fetchUser11() {
	        String apiUrl = "https://jsonplaceholder.typicode.com/users";
	        System.out.println("users "+Thread.currentThread().getName());
	        return CompletableFuture.completedFuture(restTemplate.getForEntity(apiUrl, String.class));
	    }*/
}
