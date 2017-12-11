package com.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.entity.UserFile;

public interface UserFileRepository extends CrudRepository<UserFile, Long> {
	List<UserFile> findAll();

}
