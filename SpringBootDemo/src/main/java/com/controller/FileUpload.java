package com.controller;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.entity.User;
import com.service.UserFileService;
import com.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.html.HTMLParagraphElement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.entity.*;

@RestController
public class FileUpload {
	
	@Autowired
	UserFileService userservice;
	
	@PostMapping("/upload")
	public ResponseEntity<?> fileUpload(@RequestBody MultipartFile file) {
    	//String n = (session.getAttribute("username")).toString();
    	String n = "ujjval";
    	new File("C:/uploads/"+n+"/").mkdir();
		String UPLOAD_FOLDER = "C:/uploads/"+n+"/";
    	System.out.println("API SUCCESS---------"+UPLOAD_FOLDER);
    	
	try {
			System.out.println("**TRY file: "+file.getOriginalFilename());
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);
			UserFile userfile = new UserFile(file.getOriginalFilename(),"uploads", 0, 2);
			userservice.addFile(userfile);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ResponseEntity(1,HttpStatus.CREATED);
	}

}
