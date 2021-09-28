package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isAnagramTest {

    @Test
    void isAnagram() {
        assertTrue(isAnagram.isAnagram("tone","note"));
        assertFalse(isAnagram.isAnagram("abc","abcd"));
        System.out.println("This test ran");

    }
}