package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo") 
public class SocialMediaMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialMediaMonitoringApplication.class, args);
		//GetTweets get = new GetTweets();
		//get.getTweetMention();
	}

}
