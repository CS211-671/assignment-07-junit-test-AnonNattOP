package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {

        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("John", "1");
        userList.addUser("Jack", "2");
        userList.addUser("Jane", "3");

        // TODO: find one of them
        User user = userList.findUserByUsername("John");

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        String expected = "John";
        // String actual = user.getUsername();
        String actual = user.getUsername();
        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {

        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("John", "1");
        userList.addUser("Jack", "2");
        userList.addUser("Jane", "3");
        // TODO: change password of one user
        boolean actual = userList.changePassword("Jack", "2", "4");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("John", "1");
        userList.addUser("Jack", "2");
        userList.addUser("Jane", "3");
        // TODO: call login() with correct username and password
        User expected = userList.findUserByUsername("John");
        User actual = userList.login("John", "1");
        // TODO: assert that User object is found
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("John", "1");
        userList.addUser("Jack", "2");
        userList.addUser("Jane", "3");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("John", "2");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}