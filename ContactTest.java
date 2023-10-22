/* Mohamed babiker */

package Hidden;

import org.junit.jupiter.api.Test;

import Contact.Contact;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class SecureTest {

	@Test
	@DisplayName("Verification of Contact ID length")
	void checkContactIDLength() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", "Address");
		if (contact.getContactID().length() > 10) {
			fail("Invalid Contact ID length.");
		}
	}

	@Test
	@DisplayName("Verification of Contact First Name length")
	void checkContactFirstNameLength() {
		Contact contact = new Contact("OllyOllyOxenFree", "LastName", "PhoneNumbr", "Address");
		if (contact.getFirstName().length() > 10) {
			fail("Invalid First Name length.");
		}
	}

	@Test
	@DisplayName("Verification of Contact Last Name length")
	void checkContactLastNameLength() {
		Contact contact = new Contact("FirstName", "OllyOllyOxenFree", "PhoneNumbr", "Address");
		if (contact.getLastName().length() > 10) {
			fail("Invalid Last Name length.");
		}
	}

	@Test
	@DisplayName("Verification of Contact phone number length")
	void checkContactNumberLength() {
		Contact contact = new Contact("FirstName", "LastName", "55555555555", "Address");
		if (contact.getNumber().length() != 10) {
			fail("Invalid Phone number length.");
		}
	}

	@Test
	@DisplayName("Verification of Contact address length")
	void checkContactAddressLength() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr",
				"123456789 is nine characters long" + "123456789 is another nine characters long");
		if (contact.getAddress().length() > 30) {
			fail("Invalid Address length.");
		}
	}

	@Test
	@DisplayName("Verification of non-null Contact First Name")
	void checkContactFirstNameNotNull() {
		Contact contact = new Contact(null, "LastName", "PhoneNumbr", "Address");
		assertNotNull(contact.getFirstName(), "First name was null.");
	}

	@Test
	@DisplayName("Verification of non-null Contact Last Name")
	void checkContactLastNameNotNull() {
		Contact contact = new Contact("FirstName", null, "PhoneNumbr", "Address");
		assertNotNull(contact.getLastName(), "Last name was null.");
	}

	@Test
	@DisplayName("Verification of non-null Contact Phone Number")
	void checkContactPhoneNotNull() {
		Contact contact = new Contact("FirstName", "LastName", null, "Address");
		assertNotNull(contact.getNumber(), "Phone number was null.");
	}
	
	@Test
	@DisplayName("Verification of non-null Contact Address")
	void checkContactAddressNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", null);
		assertNotNull(contact.getAddress(), "Address was null.");
	}
}
