
package com.controller;

import java.io.*;

import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserFile;
import com.service.UserFileService;

import java.nio.file.*;

@RestController
public class Download
{
	
	@Autowired
	public static UserFileService userservice;
	
	@RequestMapping("/download")
    public void filedownload(@RequestBody String name) throws IOException
    {
		String n = name;
		//System.out.println(n);
		String[] words=n.split("="); 
		String part1 = words[1];
		
		
        Path temp = Files.copy
        (Paths.get("C:\\uploads\\ujjval\\" + words[1] + "\\"), 
        Paths.get("C:\\downloads\\"+ words[1] + "\\"));
        
        
 
        if(temp != null)
        {
            System.out.println("File downloaded successfully");
            UserFile userfile = new UserFile(words[1],"downloaded", 0, 2);
			userservice.addFile(userfile);
			
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    }
}
