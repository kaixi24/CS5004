package package1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    private Author testAuthor;
    @BeforeEach
    void setUp() {
        testAuthor = new Author("James Bond", "bjj@uk", "London, uk");
    }

    @Test
    void getName() {
        assertEquals("James Bond", testAuthor.getName());
    }

    @Test
    void getEmail() {
        assertEquals("bjj@uk", testAuthor.getEmail());
    }

    @Test
    void getAddress() {
        assertEquals("London, uk", testAuthor.getAddress());
    }

}