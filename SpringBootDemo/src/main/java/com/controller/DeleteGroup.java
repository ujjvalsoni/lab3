package com.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserFile;
import com.service.UserFileService;

@RestController
public class DeleteGroup {
	
	@Autowired
	UserFileService userservice;
	
	@PostMapping("/deletegroup")
	public void create (@RequestBody String name) {
		String n = name;
		//System.out.println(n);
		String[] words=n.split("="); 
		String part1 = words[1];
		System.out.println(words[1]);
		
		File file = new File("C:\\uploads\\" + words[1] + "\\");
		if(file.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }

		
		UserFile userfile = new UserFile(words[1],"deleted", 0, 2);
		userservice.addFile(userfile);

		
	}

}
