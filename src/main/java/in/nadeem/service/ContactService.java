package in.nadeem.service;

import java.util.List;

import in.nadeem.entity.Contact;

public interface ContactService {

	String upsert (Contact contact);
	
	List<Contact> getAllContacts();
	
	Contact getContact(int cid);
	
	String deletContact(int cid);
}
