package ucr.ac.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ucr.ac.cr.project.Users;
import ucr.ac.cr.service.UserService;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("User/ListAll")
    public List<Users> list() { return  service.getAllStudents(); }
}
