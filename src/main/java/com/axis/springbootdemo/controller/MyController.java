package com.axis.springbootdemo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.axis.springbootdemo.entityy.Cricketer;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MyController {
	private static ArrayList<Cricketer> crickList ;
	static{
		crickList = new ArrayList<Cricketer>();
			crickList.add(new Cricketer(1005,"smrithi",56,40,3,8,130.0));
			crickList.add(new Cricketer(1006,"virat",56,40,3,8,130.0));
			
	}
	
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello...";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "WELCOME";
	}

	
	//get All cricketors
	@GetMapping ("/cricketer")
	public ArrayList<Cricketer>  getCricketer() { 
		return crickList;
	}
	
	//Get Cricketer by Id
	@GetMapping("/cricketer/{cricketerId}")
	public Cricketer getCricketerById(@PathVariable int cricketerId)
	{
		for (Cricketer ck: crickList) {
	if(ck.getCricketerId() == cricketerId) { 
		return ck;

			//cutumn Cricketer it Id is found
		}
	}
	return null;

	}
	
	//add cricketor
	@PostMapping("/cricketer")
	public ResponseEntity<String> addCricketer(@RequestBody Cricketer cricketer){
		crickList.add(cricketer);
		return new ResponseEntity<String>("Cricketer Added Sucessfully...",HttpStatus.OK);
	}
}

