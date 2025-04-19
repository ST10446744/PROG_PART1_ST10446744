package com.onlyglobal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LoginTest {

    @Test
    public void testCheckUserName_valid() {
        Login login = new Login();
        assertTrue(login.checkUserName("abc_"), "Should return true for valid username");
    }

    @Test
    public void testCheckUserName_invalid() {
        Login login = new Login();
        assertFalse(login.checkUserName("abcdef"), "Should return false for username longer than 5 or missing underscore");
    }

    @Test
    public void testCheckPasswordComplexity_valid() {
        Login login = new Login();
        assertTrue(login.checkPasswordComplexity("Test@123"), "Valid password should return true");
    }

    @Test
    public void testCheckPasswordComplexity_invalid() {
        Login login = new Login();
        assertFalse(login.checkPasswordComplexity("test123"), "Password without uppercase or special char should return false");
    }

    @Test
    public void testCheckCellPhoneNumber_valid() {
        Login login = new Login();
        assertTrue(login.checkCellPhoneNumber("+2712345678"), "Valid phone number with country code should return true");
    }

    @Test
    public void testCheckCellPhoneNumber_invalid() {
        Login login = new Login();
        assertFalse(login.checkCellPhoneNumber("1234567890"), "Missing country code should return false");
    }
}




