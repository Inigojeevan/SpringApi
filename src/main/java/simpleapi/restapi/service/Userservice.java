package simpleapi.restapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import simpleapi.restapi.model.Usermodel;

@Service
public class Userservice {

    private List<Usermodel> users;

    public Userservice() {
        users = new ArrayList<>();

        Usermodel user1 = new Usermodel(1,"Jeevan", 20, "example1.gmail.com");
        Usermodel user2 = new Usermodel(2,"Inigo", 21, "example2.gmail.com");
        Usermodel user3 = new Usermodel(3,"Whoever", 22, "example3.gmail.com");
        Usermodel user4 = new Usermodel(4,"foo", 23, "example4.gmail.com");
        Usermodel user5 = new Usermodel(5,"idkwhatelsetoname", 24, "example5.gmail.com");

        users.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    @SuppressWarnings("unchecked")
    public Optional<Usermodel> getUserbyID(Integer id) {
        @SuppressWarnings("rawtypes")
        Optional option = Optional.empty();
        for(Usermodel user : users) {
            if(user.getID() == id) {
                option = Optional.of(user);
                return option;
            }
        }
        return option;
    }
}
