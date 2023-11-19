package com.dinhle.BookingTicket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinhle.BookingTicket.model.User;
import com.dinhle.BookingTicket.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	
//	@GetMapping("/{userId}")
//	public ResponseEntity<User> getUser(@PathVariable Long user_id){
//		User user = userService.getUserById(user_id);
//		if(user != null) {
//			return new ResponseEntity<>(user, HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
}
