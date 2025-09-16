package com.example.Ipaddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/ip")
public class ipcontroller {
	@GetMapping("/get")
	public String ip() {
		return "hello abishek";
		
	}

}
