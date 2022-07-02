package software.ariel.twitterclonebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import software.ariel.twitterclonebackend.entity.User;
import software.ariel.twitterclonebackend.service.UserService;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService=userService;
    }

    @PostMapping("/add")
    public @ResponseBody String addUser(@RequestParam String name, @RequestParam String email, @RequestParam int year, @RequestParam int month ,@RequestParam int day) {
        userService.addNewUser(name, email, year, month, day);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> showUsers() {
        return userService.getAllUsers();
    }


}
