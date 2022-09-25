package com.aashish.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Hello Aashish Sali  - 1";

	}

	/*
		echo "# github-actions-docker" >> README.md
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/Aashishsali1988/github-actions-docker.git
		git push -u origin main

		git remote add origin https://github.com/Aashishsali1988/github-actions-docker.git
		git branch -M main
		git push -u origin main
	*/

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
