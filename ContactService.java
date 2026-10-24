// Domenic Ferraro
// CS 320 Software Test, Automation
// Module Three Milestone
// September 15, 2026

import java.util.ArrayList;

public class ContactService {

	ArrayList<Contact> list = new ArrayList<Contact>();
	
	// Add contact
	public boolean addContact(Contact contact) {
		for (Contact c : list) {
	        if (contact.getId().equalsIgnoreCase(c.getId())) {
	            return false;
	        }
	    }

	    list.add(contact);
	    return true;
	}
	
	// Delete contact
	public boolean deleteContact(String id) {
		for (int i = 0; i < list.size(); i++) {
	        if (list.get(i).getId().equalsIgnoreCase(id)) {
	            list.remove(i);
	            return true;
	        }
	    }
	    return false;
	}
	
	// Update contact
	public boolean updateContact(String id, String firstName, String lastName,
			String phoneNumber, String address) {
		
		for (Contact c : list) {
			if (c.getId().equalsIgnoreCase(id)) {
				c.setFirstName(firstName);
				c.setLastName(lastName);
				c.setPhoneNumber(phoneNumber);
				c.setAddress(address);
				
				return true;
			}
		}
		return false;
	}
	
}
