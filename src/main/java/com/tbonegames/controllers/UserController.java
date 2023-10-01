package com.tbonegames.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbonegames.services.UserServices;

@RestController
@RequestMapping("/api/entities")
public class UserController {

	private final UserServices userServices;
	
}
