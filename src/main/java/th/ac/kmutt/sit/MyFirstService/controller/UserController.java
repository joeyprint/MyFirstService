package th.ac.kmutt.sit.MyFirstService.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class UserController {

//    @RequestMapping("/user/1")
//    public User getUser() {
//        return new User(1, "Wasin");
//    }

    @RequestMapping("/allusers")
    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();

        users.add(0, new User(1, "Jo"));
        users.add(1, new User(2, "Ming"));
        users.add(2, new User(3, "Nan"));
        users.add(3, new User(4, "Game"));
        users.add(4, new User(5, "Boat"));

        return users;
    }

    @RequestMapping("/user")
    public User getUser(@RequestParam(value="id") int id) {
        ArrayList<User> users = new ArrayList<>();

        users.add(0, new User(1, "Jo"));
        users.add(1, new User(2, "Ming"));
        users.add(2, new User(3, "Nan"));
        users.add(3, new User(4, "Game"));
        users.add(4, new User(5, "Boat"));

        User user = users.get(id-1);
        return user;
    }

}