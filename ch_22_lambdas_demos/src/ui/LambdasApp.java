package ui;

import java.util.*;

import business.Contact;
import interfaces.TestContact;

public class LambdasApp {

	public static void main(String[] args) {
		System.out.println("Welcome to lambdas.");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All contacts");
		for (Contact c : contacts) {
			System.out.println(c);
		}

		System.out.println("============================================");
		System.out.println();
		System.out.println("Contacts no phone - no lambda");
		List<Contact> contactsWithoutPhone = filterContactsWithoutPhone(contacts);
		printContacts(contactsWithoutPhone);
		
		
		System.out.println("============================================");
		System.out.println();
		System.out.println("Contacts no email - no lambda");
		List<Contact> contactsWithoutEmail = filterContactsWithoutEmail(contacts);
		printContacts(contactsWithoutEmail);
		
		System.out.println("============================================");
		System.out.println();
		System.out.println("Contacts no email & no phone - no lambda");
		List<Contact> contactsWithoutPhoneEmail = filterContactsWithoutPhoneEmail(contacts);
		printContacts(contactsWithoutPhoneEmail);		
		
		System.out.println("============================================");
		System.out.println();
		System.out.println("Contacts no email & no phone - lambda method");
		contactsWithoutPhone = filteredContacts(contacts, 
								c -> c.getPhone() == null && c.getEmail() == null);		
		printContacts(contactsWithoutPhone);
		
		

		System.out.println();
		System.out.println("Thank you for using the app");
	}

	
	public static void printContacts(List<Contact> contacts) {
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}
	
	/*
	 * Lambda method
	 */
	public static List<Contact> filteredContacts(List<Contact> contacts, TestContact condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		
		
		
		return filteredContacts;
	}
	
	/*
	 * Below methods do not use Lambdas
	 */
	public static List<Contact> filterContactsWithoutPhone(List<Contact> contacts){
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}
		return contactsWithoutPhone;
	}

	
	public static List<Contact> filterContactsWithoutEmail(List<Contact> contacts){
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getEmail() == null) {
				contactsWithoutEmail.add(c);
			}
		}
		return contactsWithoutEmail;
	}

	public static List<Contact> filterContactsWithoutPhoneEmail(List<Contact> contacts){
		List<Contact> contactsWithoutPhoneEmail = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getEmail() == null && c.getPhone() == null) {
				contactsWithoutPhoneEmail.add(c);
			}
		}
		return contactsWithoutPhoneEmail;
	}

}
