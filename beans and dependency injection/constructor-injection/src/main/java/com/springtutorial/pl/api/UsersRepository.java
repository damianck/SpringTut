package com.springtutorial.pl.api;

import com.springtutorial.pl.domain.User;

public interface UsersRepository {
	User createUser(String name);
}
