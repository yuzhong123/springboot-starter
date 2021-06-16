package com.example.demo.service;


import com.example.demo.config.PersonServiceProperties;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	private PersonServiceProperties properties;
	
	public PersonService(PersonServiceProperties properties){
		this.properties = properties;
	}
	
	public PersonService(){
		
	}
	
	public String getPersonName(){
		return properties.getName();
	}
	
	public int getPersonAge(){
		return properties.getAge();
	}
	
	public String getPersonSex(){
		return properties.getSex();
	}
}