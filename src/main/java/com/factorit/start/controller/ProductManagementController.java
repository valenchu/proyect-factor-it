package com.factorit.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factorit.start.utils.Utils;

import springfox.documentation.service.RequestBody;

@RestController
@CrossOrigin("*")
@RequestMapping("management")
public class ProductManagementController {
	
	@Autowired(required = true)
	Utils utils;

	@PostMapping("createArticle")
	public ResponseEntity<?> createArticle() {
		return null;

	}
	
	@DeleteMapping("deleteArticle")
	public ResponseEntity<?> deleteArticle() {
		return null;

	}
	
	@GetMapping("getArticle")
	public ResponseEntity<?> getArticle() {
		System.out.println(utils.generateUUID());
		return null;
	}

}
