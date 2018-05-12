package com.geeklife.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootdemo2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Springbootdemo2Application.class);
		app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

	}
	
	@Override
    public void run(String... args) {
    	System.out.println("Hello World.");
    }
}
