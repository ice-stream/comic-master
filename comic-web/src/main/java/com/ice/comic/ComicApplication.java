package com.ice.comic;


import com.stream.comic.autocofig.EnableHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableHttpClient
@EnableAsync
public class ComicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComicApplication.class, args);
	}
}
