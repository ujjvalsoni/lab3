package com.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserFile;
import com.service.UserFileService;


//this page is called to create groups and not just creating directories 

@RestController
public class CreateDir {
	@Autowired
	UserFileService userservice;
	
	@PostMapping("/createdir")
	public void create (@RequestBody String name) {
		String n = name;
		//System.out.println(n);
		String[] words=n.split("="); 
		String part1 = words[1];
		  
		new File("C:/uploads/"+part1+"/").mkdir();
		System.out.print("done");
		
		UserFile userfile = new UserFile(words[1],"created dir", 0, 2);
		userservice.addFile(userfile);

		
	}

}
