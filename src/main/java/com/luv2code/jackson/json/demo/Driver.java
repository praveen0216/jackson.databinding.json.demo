package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			//create object mapper
			ObjectMapper mapper=new ObjectMapper();
			
			
			//read JSON file and map /convert to Java Pojo
			Student student=mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//data/sample-lite.json
			
			
			
			//print first name and last name
			System.out.println("firstName: "+student.getFirstName()+"\nLast Name : "+student.getLastName());
			
			//print out address
			Address address =student.getAddress();
			
			System.out.println("Address: Street : "+address.getStreet());
			System.out.println("Address: City :"+address.getCity());
			System.out.println("Address state : "+address.getState());
			System.out.println("Address zip : "+address.getZip());
			
			System.out.println("\nlanguage");
			for(String language: student.getLanguages()) {
			
				System.out.println(language);
			}
			
			
			
			
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
