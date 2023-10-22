/* Mohamed Babiker */

// Import the necessary class
package Contact;

import java.util.ArrayList;

// Define the ContactService class
public class ContactService {
	// Create an ArrayList to store Contact objects
	public ArrayList<Contact> contactList = new ArrayList<Contact>();

	// Display the list of contacts
	public void displayContactList() {
		for (int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
		}
	}

	// Add a new contact to the contact list
	public void addContact(String firstName, String lastName, String number, String address) {
		Contact contact = new Contact(firstName, lastName, number, address);
		contactList.add(contact);
	}

	// Get a contact by its contact ID
	public Contact getContact(String contactID) {
		Contact contact = new Contact(null, null, null, null);
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().contentEquals(contactID)) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}

	// Delete a contact by its contact ID
	public void deleteContact(String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.remove(counter);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}

	// Update the first name of a contact by its contact ID
	public void updateFirstName(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setFirstName(updatedString);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}

	// Update the last name of a contact by its contact ID
	public void updateLastName(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setLastName(updatedString);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}

	// Update the phone number of a contact by its contact ID
	public void updateNumber(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setNumber(updatedString);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}

	// Update the address of a contact by its contact ID
	public void updateAddress(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setAddress(updatedString);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
}
