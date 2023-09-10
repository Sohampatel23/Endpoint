package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiCall {

    @Autowired
    House home;

    @GetMapping("api/v1/home")
    public House getRoom()
    {
        return home;
    }

    @PutMapping("api/v1/change/room")
    public String setRoom()
    {
        home.setRoom("children");
        return "room changed";
    }
}
