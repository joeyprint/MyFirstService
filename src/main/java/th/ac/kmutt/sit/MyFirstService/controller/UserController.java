package th.ac.kmutt.sit.MyFirstService.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class UserController {

    private ArrayList<User> users; //ADD Array User
    public UserController() {
        users = new ArrayList<User>();

        users.add(new User(1, "Wasin"));
        users.add(new User(2, "Kunlakarn"));
        users.add(new User(3, "Nathawat"));
        users.add(new User(4, "Supawit"));
        users.add(new User(5, "Putchamon"));
    }

    //Get List User
    @RequestMapping(value = "/allusers", method = RequestMethod.GET)
    public ArrayList<User> getAllUsers() {
        return this.users;
    }

    //Get By ID
    @GetMapping("/user/{id:[\\d]}") // [\\d] is Regular Expression (Decimal)
    public User getUser(@PathVariable(name = "id") int id) {
        return this.users.get(id - 1);
    }

}