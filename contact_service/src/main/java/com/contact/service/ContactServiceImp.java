package com.contact.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImp implements ContactService {

	List<Contact> list=List.of(
			   new Contact(1l, "munjesh@gmail.com", "Munjesh Kumar", 101l),
			   new Contact(2l, "ranjeet@gmail.com", "Ranjeet Singh", 102l),
			   new Contact(3l, "Upendra@gmail.com", "Upendra Kumar", 102l),
			   new Contact(4l, "Santosh@gmail.com", "Santosh Kumar", 103l)
			);
	
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {	
		System.out.println("user Id : "+userId);
		return list.stream().filter(con->con.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
