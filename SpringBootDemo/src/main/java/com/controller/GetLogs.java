package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserFile;
import com.service.UserFileService;
@RestController 
@CrossOrigin(origins = "http://localhost:3000")
public class GetLogs {

	@Autowired
	UserFileService userservice;
	@RequestMapping("/log")
    public @ResponseBody Iterable<UserFile> getFileListing() {

	   List<UserFile> userfiles = new ArrayList<UserFile>();
	   List<UserFile> fetchfiles = userservice.getfiles();
	   for(int i=0;i<fetchfiles.size();i++) {
			   userfiles.add(fetchfiles.get(i));
	   }
	   System.out.print(userfiles);
	   return userfiles;
    }
}
