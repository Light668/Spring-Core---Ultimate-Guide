package com.light.spring.core.javaconfig.autowire;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

	private UserRepository userRepository;

	public UserRepository getUserRepository() {
		return userRepository;
	}

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void save() {
		if (Objects.isNull(userRepository)) {
			System.out.println("No repository is provided!");
			return;
		}
		userRepository.save();
	}
}
