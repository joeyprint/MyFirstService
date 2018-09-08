package th.ac.kmutt.sit.MyFirstService;

import static org.junit.Assert.*;
import org.junit.Test;
import th.ac.kmutt.sit.MyFirstService.controller.UserController;

public class UserTest {

    @Test
    public void getUser() {

        UserController userController = new UserController();
        assertEquals(3, userController.getUser(3).getId());
        assertEquals("Nathawat", userController.getUser(3).getName());

    }

    @Test
    public void getAllUser() {

        UserController userController = new UserController();
        assertEquals(5, userController.getAllUsers().size());

    }

}