package com.spry;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class DemoForGeneratePass {

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
}
