// Domenic Ferraro
// CS 320 Software Test, Automation
// Module Three Milestone
// September 15, 2026

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345", "Domenic", "Ferraro", "1234567890", "123 Main Street");
		assertTrue(contact.getId().equals("12345"));
		assertTrue(contact.getFirstName().equals("Domenic"));
		assertTrue(contact.getLastName().equals("Ferraro"));
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 Main Street"));
	}

	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Domenic", "Ferraro", "1234567890", "123 Main Street");
		}); 
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890123", "Domenic", "Ferraro", "1234567890", "123 Main Street");
		}); 
	}
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "Ferraro", "1234567890", "123 Main Street");
		}); 
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Name Too Long", "Ferraro", "1234567890", "123 Main Street");
		}); 
	}
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Domenic", null, "1234567890", "123 Main Street");
		}); 
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Domenic", "Name Too Long", "1234567890", "123 Main Street");
		}); 
	}
	
	@Test
	void testContactPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Domenic", "Ferraro", null, "123 Main Street");
		}); 
	}
	
	@Test
	void testContactPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Domenic", "Ferraro", "1234567890123", "123 Main Street");
		}); 
	}
	
	@Test
	void testContactPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Domenic", "Ferraro", "12345", "123 Main Street");
		}); 
	}
	
	
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Domenic", "Ferraro", "1234567890", null);
		}); 
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Domenic", "Ferraro", "1234567890", "This Address Is Entirely Too Long");
		}); 
	}
	
	// Testing setters
	
	// First name setter tests
    @Test
    void setFirstNameValid() {
        Contact contact = new Contact();

        contact.setFirstName("Domenic");

        assertEquals("Domenic", contact.getFirstName());
    }

    @Test
    void setFirstNameNull() {
    	Contact contact = new Contact();

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> contact.setFirstName(null)
        );

        assertEquals("Invalid First Name", exception.getMessage());
    }

    @Test
    void setFirstNameTooLong() {
    	Contact contact = new Contact();

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> contact.setFirstName("Name Too Long")
        );

        assertEquals("Invalid First Name", exception.getMessage());
    }

    // Last name setter tests
    @Test
    void setLastNameValid() {
        Contact contact = new Contact();

        contact.setLastName("Ferraro");

        assertEquals("Ferraro", contact.getLastName());
    }

    @Test
    void setLastNameNull() {
    	Contact contact = new Contact();

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> contact.setLastName(null)
        );

        assertEquals("Invalid Last Name", exception.getMessage());
    }

    @Test
    void setLastNameTooLong() {
    	Contact contact = new Contact();

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> contact.setLastName("Name Too Long")
        );

        assertEquals("Invalid Last Name", exception.getMessage());
    }
    
    // Phone number setter tests
    @Test
    void setPhoneNumberValid() {
        Contact contact = new Contact();

        contact.setPhoneNumber("1234567890");

        assertEquals("1234567890", contact.getPhoneNumber());
    }

    @Test
    void setPhoneNumberNull() {
    	Contact contact = new Contact();

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> contact.setPhoneNumber(null)
        );

        assertEquals("Invalid Phone Number", exception.getMessage());
    }

    @Test
    void setPhoneNumberTooLong() {
    	Contact contact = new Contact();

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> contact.setPhoneNumber("1234567890123")
        );

        assertEquals("Invalid Phone Number", exception.getMessage());
    }
    
    @Test
    void setPhoneNumberTooShort() {
    	Contact contact = new Contact();

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> contact.setPhoneNumber("12345")
        );

        assertEquals("Invalid Phone Number", exception.getMessage());
    }
    
    // Address setter tests
    @Test
    void setAddressValid() {
        Contact contact = new Contact();

        contact.setAddress("123 Main Street");

        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    void setAddressNull() {
    	Contact contact = new Contact();

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> contact.setAddress(null)
        );

        assertEquals("Invalid Address", exception.getMessage());
    }

    @Test
    void setAddressTooLong() {
    	Contact contact = new Contact();

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> contact.setAddress("This Address Is Entirely Too Long")
        );

        assertEquals("Invalid Address", exception.getMessage());
    }
}
 