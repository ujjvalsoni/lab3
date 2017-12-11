package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.UserFile;
import com.repository.UserFileRepository;

@Service
public class UserFileService {
	@Autowired
    private UserFileRepository userFile;
	public void addFile(UserFile file){
        userFile.save(file);
    }
	
	public List<UserFile> getfiles(){
        return userFile.findAll();
    }
}
