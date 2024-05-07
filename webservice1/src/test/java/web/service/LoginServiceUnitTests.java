package web.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginServiceUnitTests {
	@Test
    public void testLoginSuccess() {
        // Test successful login with valid credentials
        assertTrue(LoginService.login("ahsan", "ahsan_pass", "1990-01-01"));
    }

    @Test
    public void testLoginFailureInvalidUsername() {
        // Test unsuccessful login with invalid username
        assertFalse(LoginService.login("InvalidUsername", "ahsan_pass", "1990-01-01"));
    }

    @Test
    public void testLoginFailureInvalidPassword() {
        // Test unsuccessful login with invalid password
        assertFalse(LoginService.login("ahsan", "InvalidPassword", "1990-01-01"));
    }

    @Test
    public void testLoginFailureInvalidDob() {
        // Test unsuccessful login with invalid date of birth
        assertFalse(LoginService.login("ahsan", "ahsan_pass", "1999-12-31"));
    }

    @Test
    public void testLoginFailureEmptyFields() {
        // Test unsuccessful login with empty input fields
        assertFalse(LoginService.login("", "", ""));
    }
    
    @Test
    public void testLoginFailureEmptyUsername() {
        // Test unsuccessful login with empty input fields
        assertFalse(LoginService.login("", "ahsan_pass", "1990-01-01"));
    }
    
    @Test
    public void testLoginFailureEmptyPassword() {
        // Test unsuccessful login with empty input fields
        assertFalse(LoginService.login("ahsan", "", "1990-01-01"));
    }
    
    @Test
    public void testLoginFailureEmptyDob() {
        // Test unsuccessful login with empty input fields
        assertFalse(LoginService.login("ahsan", "ahsan_pass", ""));
    }
    @Test
    public void testNullUsername() {
        assertFalse(LoginService.login(null, "ahsan_pass", "1990-01-01"));
    }

    @Test
    public void testNullPassword() {
        assertFalse(LoginService.login("ahsan", null, "1990-01-01"));
    }

    @Test
    public void testNullDOB() {
        assertFalse(LoginService.login("ahsan", "ahsan_pass", null));
    }

    @Test
    public void testAllNull() {
        assertFalse(LoginService.login(null, null, null));
    }

    @Test
    public void testWhitespaceInput() {
        assertTrue(LoginService.login("  ahsan  ", "  ahsan_pass  ", "  1990-01-01  "));
    }

}
