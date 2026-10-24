// Domenic Ferraro
// CS 320 Software Test, Automation
// Module Three Milestone
// September 15, 2026

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	// Add contact tests
	@Test
    void testAddContact() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
            "12345",
            "Domenic",
            "Ferraro",
            "1234567890",
            "123 Main Street"
        );

        // Tests adding to an empty list
        assertTrue(service.addContact(contact));
    }

    @Test
    void testAddContactDuplicateId() {
        ContactService service = new ContactService();

        Contact contact1 = new Contact(
            "12345",
            "Domenic",
            "Ferraro",
            "1234567890",
            "123 Main Street"
        );

        Contact contact2 = new Contact(
            "12345",
            "John",
            "Smith",
            "0987654321",
            "456 Main Street"
        );

        service.addContact(contact1);

        // Tests duplicate ID
        assertFalse(service.addContact(contact2));
    }
    
    // Delete contact tests
    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
            "12345",
            "Domenic",
            "Ferraro",
            "1234567890",
            "123 Main Street"
        );

        service.addContact(contact);

        // Tests finding and deleting a contact
        assertTrue(service.deleteContact("12345"));
    }

    @Test
    void testDeleteContactNotFound() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
            "12345",
            "Domenic",
            "Ferraro",
            "1234567890",
            "123 Main Street"
        );

        service.addContact(contact);

        // Tests ID that does not exist
        assertFalse(service.deleteContact("99999"));
    }
    
    // Update contact tests
    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
            "12345",
            "Domenic",
            "Ferraro",
            "1234567890",
            "123 Main Street"
        );

        service.addContact(contact);

        // Tests finding and updating a contact
        assertTrue(service.updateContact(
            "12345",
            "John",
            "Smith",
            "0987654321",
            "456 Main Street"
        ));

        // Verify all four fields were updated
        assertEquals("John", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("0987654321", contact.getPhoneNumber());
        assertEquals("456 Main Street", contact.getAddress());
    }

    @Test
    void testUpdateContactNotFound() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
            "12345",
            "Domenic",
            "Ferraro",
            "1234567890",
            "123 Main Street"
        );

        service.addContact(contact);

        // Tests ID that does not exist
        assertFalse(service.updateContact(
            "99999",
            "John",
            "Smith",
            "0987654321",
            "456 Main Street"
        ));
    }
    
    // Test case sensitive IDs
    @Test
    void testAddContactDuplicateIdCaseInsensitive() {
        ContactService service = new ContactService();

        Contact contact1 = new Contact(
            "ABC123",
            "Domenic",
            "Ferraro",
            "1234567890",
            "123 Main Street"
        );

        Contact contact2 = new Contact(
            "abc123",
            "John",
            "Smith",
            "0987654321",
            "456 Main Street"
        );

        service.addContact(contact1);

        // ABC123 and abc123 should be considered the same ID
        assertFalse(service.addContact(contact2));
    }

    @Test
    void testDeleteContactCaseInsensitive() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
            "ABC123",
            "Domenic",
            "Ferraro",
            "1234567890",
            "123 Main Street"
        );

        service.addContact(contact);

        assertTrue(service.deleteContact("abc123"));
    }

    @Test
    void testUpdateContactCaseInsensitive() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
            "ABC123",
            "Domenic",
            "Ferraro",
            "1234567890",
            "123 Main Street"
        );

        service.addContact(contact);

        assertTrue(service.updateContact(
            "abc123",
            "John",
            "Smith",
            "0987654321",
            "456 Main Street"
        ));

        assertEquals("John", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("0987654321", contact.getPhoneNumber());
        assertEquals("456 Main Street", contact.getAddress());
    }
}
