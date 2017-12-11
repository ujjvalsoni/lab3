package com.controller;


import java.io.File;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserFile;
import com.service.UserFileService;

@RestController 
@CrossOrigin(origins = "http://localhost:3000")
public class GetFiles {
	@Autowired
	UserFileService userservice;
	
	@RequestMapping("/getfiles")
	public ArrayList<String> hello() {
		ArrayList<String> test1 = new ArrayList<String>();
		File folder = new File("C:\\uploads\\ujjval");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        //System.out.println("File " + listOfFiles[i].getName());
		        test1.add(listOfFiles[i].getName());
		      } else if (listOfFiles[i].isDirectory()) {
		        //System.out.println("Directory " + listOfFiles[i].getName());
		        test1.add(listOfFiles[i].getName());
		      }
		    }		    
		    for (String number : test1) {
		    	   System.out.println("String = " + number);
		    	   }
			UserFile userfile = new UserFile("","got files", 0, 2);
			userservice.addFile(userfile);
		    return test1;
		 
}
}
