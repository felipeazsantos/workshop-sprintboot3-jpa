package com.felipeazsantos.springbootcourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeazsantos.springbootcourse.entities.User;
import com.felipeazsantos.springbootcourse.repositories.UserRepository;
import com.felipeazsantos.springbootcourse.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		UpdateData(entity, obj);
		return repository.save(entity);
	}

	private void UpdateData(User entity, User obj) {
		entity.setName(obj.getEmail());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
