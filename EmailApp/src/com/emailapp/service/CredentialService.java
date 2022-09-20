package com.emailapp.service;

import java.util.Random;

import com.emailapp.model.Employee;

public class CredentialService extends Employee {
	
	private String emailAddress;

	public char[] generatePassword() {
		
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] emailPassword = new char[8];

		for (int i = 0; i < 8; i++) {
			emailPassword[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return emailPassword;

	}

	public void generateEmailAddress(String firstName, String lastName, String department) {
		
		System.out.println("\n\nDear " + firstName.toUpperCase() + ", your generated Email Credentials are as follows:  ");
		String emailId = firstName + lastName + "@" + department + ".abc.com";
		this.emailAddress= emailId.toLowerCase();

	}

	public void showCredentials(char[] emailPassword) {
		
		System.out.println("EMAIL ID ---> " + this.emailAddress);
		System.out.println("PASSWORD ---> " + emailPassword);

	}
}
