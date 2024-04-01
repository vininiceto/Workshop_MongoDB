package com.vininiceto.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vininiceto.workshopmongo.domain.User;
import com.vininiceto.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
	return repo.findAll();	
	}
	
	
	
	
}
