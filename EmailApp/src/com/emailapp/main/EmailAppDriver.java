package com.emailapp.main;

import java.util.Scanner;

import com.emailapp.model.Employee;
import com.emailapp.service.CredentialService;

public class EmailAppDriver {

	public static void main(String[] args) {

		String department=null;
		Employee employee = new Employee();
		CredentialService credentials = new CredentialService();
		Scanner scanner = new Scanner(System.in);

		System.out.println("\t---------------------------------------------");
		System.out.println("\t WELCOME TO ABC LOGIN REGISTRATION");
		System.out.println("\t--------------------------------------------");
		System.out.println("Please Select Your Department Name:");
		System.out.println("1. TECHNICAL");
		System.out.println("2. ADMIN");
		System.out.println("3. HUMAN RESOURCE");
		System.out.println("4. LEGAL");

		int ch = scanner.nextInt();
		System.out.println("Enter your First Name: ");
		String firstName = scanner.next();
		System.out.println("Enter your Last Name: ");
		String lastName = scanner.next();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);

		switch (ch) {

		case 1: {
			System.out.println("\n------------------------------------");
			System.out.println("\tTECHNICAL DEPARTMENT");
			System.out.println("------------------------------------");
			department = "tech";
			break;
		}

		case 2: {
			System.out.println("\n------------------------------------");
			System.out.println("\tADMIN DEPARTMENT");
			System.out.println("------------------------------------");
			department = "admin";
			break;
		}
		case 3: {
			System.out.println("\n------------------------------------");
			System.out.println("\tHUMAN RESOURCE DEPARTMENT");
			System.out.println("------------------------------------");
			department = "hr";
			break;
		}

		case 4: {
			System.out.println("\n------------------------------------");
			System.out.println("\tLEGAL DEPARTMENT");
			System.out.println("------------------------------------");
			department = "legal";
			break;
		}
		default:
			System.out.println("SORRY..Invalid Option!!!");
		}

		char[] emailPassword = credentials.generatePassword();
		credentials.generateEmailAddress(firstName, lastName, department);
		credentials.showCredentials(emailPassword);
		
		scanner.close();
	}
}
