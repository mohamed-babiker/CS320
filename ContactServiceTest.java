/* Mohamed Babiker */

package Hidden;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import Contact.Contact;
import Contact.ContactService;

import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class SecureContactServiceTest {

	@Test
	@DisplayName("Update First Name Test")
	@Order(1)
	void checkUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("Mr.", "Smith", "5555552222", "123 Maple Street");
		service.updateFirstName("John", "9");
		service.displayContactList();
		assertEquals("John", service.getContact("9").getFirstName(), "First name was not updated.");
	}

	@Test
	@DisplayName("Update Last Name Test")
	@Order(2)
	void checkUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("Mrs.", "Brown", "5555553333", "456 Oak Avenue");
		service.updateLastName("Johnson", "11");
		service.displayContactList();
		assertEquals("Johnson", service.getContact("11").getLastName(), "Last name was not updated.");
	}

	@Test
	@DisplayName("Update Phone Number Test")
	@Order(3)
	void checkUpdatePhoneNumber() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Williams", "5555554444", "789 Elm Road");
		service.updateNumber("5555559999", "17");
		assertEquals("5555559999", service.getContact("17").getNumber(), "Phone number was not updated.");
	}

	@Test
	@DisplayName("Update Address Test")
	@Order(4)
	void checkUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("Mr.", "Davis", "5555555555", "321 Pine Lane");
		service.updateAddress("555 Cedar Street", "15");
		service.displayContactList();
		assertEquals("555 Cedar Street", service.getContact("15").getAddress(), "Address was not updated.");
	}

	@Test
	@DisplayName("Contact Deletion Test")
	@Order(5)
	void checkContactDeletion() {
		ContactService service = new ContactService();
		service.addContact("Mrs.", "Martinez", "5555556666", "654 Birch Drive");
		service.deleteContact("17");
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		service.displayContactList();
		assertEquals(service.contactList, contactListEmpty, "The contact was not deleted.");
	}

	@Test
	@DisplayName("Contact Addition Test")
	@Order(6)
	void checkContactAddition() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Lee", "5555557777", "987 Walnut Lane");
		service.displayContactList();
		assertNotNull(service.getContact("0"), "Contact was not added correctly.");
	}
}
