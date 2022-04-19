package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
    
	@Autowired
	ContactService contactService;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContactsOfUser(@PathVariable("userId") Long userId)
	{
		System.out.println("Loading the contacts details of user for Id : "+userId);
		System.out.println(contactService.getContactsOfUser(userId));
		return contactService.getContactsOfUser(userId);
	}
}
