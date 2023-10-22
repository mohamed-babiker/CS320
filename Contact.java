	/* Mohamed Babiker */

	// Import the necessary class
	package Contact;

	// Import the AtomicLong class
	import java.util.concurrent.atomic.AtomicLong;

	// Define the Contact class
	public class Contact {
		// Declare instance variables
		private final String contactID;
		private String firstName;
		private String lastName;
		private String number;
		private String address;
		private static AtomicLong idGenerator = new AtomicLong(); // A generator for unique contact IDs

		// Constructor to initialize the Contact object
		public Contact(String firstName, String lastName, String number, String address) {
			// Generate a unique contact ID for each contact
			this.contactID = String.valueOf(idGenerator.getAndIncrement());

			// Validate and set the first name
			if (firstName == null || firstName.isEmpty()) {
				this.firstName = "NULL"; // If first name is null or empty, set to "NULL"
			} else if (firstName.length() > 10) {
				this.firstName = firstName.substring(0, 10); // If first name is longer than 10 characters, truncate it
			} else {
				this.firstName = firstName; // Otherwise, set the first name as provided
			}

			// Validate and set the last name
			if (lastName == null || lastName.isEmpty()) {
				this.lastName = "NULL"; // If last name is null or empty, set to "NULL"
			} else if (lastName.length() > 10) {
				this.lastName = lastName.substring(0, 10); // If last name is longer than 10 characters, truncate it
			} else {
				this.lastName = lastName; // Otherwise, set the last name as provided
			}

			// Validate and set the phone number
			if (number == null || number.isEmpty() || number.length() != 10) {
				this.number = "5555555555"; // If number is null, empty, or not 10 characters, set a default number
			} else {
				this.number = number; // Otherwise, set the number as provided
			}

			// Validate and set the address
			if (address == null || address.isEmpty()) {
				this.address = "NULL"; // If address is null or empty, set to "NULL"
			} else if (address.length() > 30) {
				this.address = address.substring(0, 30); // If address is longer than 30 characters, truncate it
			} else {
				this.address = address; // Otherwise, set the address as provided
			}
		}

		// Getter methods for retrieving contact information
		public String getContactID() {
			return contactID;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public String getNumber() {
			return number;
		}

		public String getAddress() {
			return address;
		}

		// Setter methods to update contact information, with similar validation
		public void setFirstName(String firstName) {
			if (firstName == null || firstName.isEmpty()) {
				this.firstName = "NULL";
			} else if (firstName.length() > 10) {
				this.firstName = firstName.substring(0, 10);
			} else {
				this.firstName = firstName;
			}
		}

		public void setLastName(String lastName) {
			if (lastName == null || lastName.isEmpty()) {
				this.lastName = "NULL";
			} else if (lastName.length() > 10) {
				this.lastName = lastName.substring(0, 10);
			} else {
				this.lastName = lastName;
			}
		}

		public void setNumber(String number) {
			if (number == null || number.isEmpty() || number.length() != 10) {
				this.number = "5555555555";
			} else {
				this.number = number;
			}
		}

		public void setAddress(String address) {
			if (address == null || address.isEmpty()) {
				this.address = "NULL";
			} else if (address.length() > 30) {
				this.address = address.substring(0, 30);
			} else {
				this.address = address;
		}
	}
	}