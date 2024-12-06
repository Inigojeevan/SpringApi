package simpleapi.restapi.controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.RestController;

import simpleapi.restapi.model.Usermodel;
import simpleapi.restapi.service.Userservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Usercontroller {
    private Userservice userservice;

    public Usercontroller(Userservice userservice) {
        this.userservice = userservice;
    }

    @GetMapping("/") 
    public String home() {
        return "Welcome to the USER API";
    }
    
    @GetMapping("/user")
    public Usermodel getUser(@RequestParam Integer ID) {
        Optional <Usermodel> user = userservice.getUserbyID(ID);
        if(user.isPresent()) {
            return (Usermodel) user.get();
        }
        return null;
    } 
}
