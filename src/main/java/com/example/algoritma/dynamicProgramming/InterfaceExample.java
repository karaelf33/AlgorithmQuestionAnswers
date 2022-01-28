package com.example.algoritma.dynamicProgramming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/airlineAirportsRelation")
public class InterfaceExample {

    @Autowired
     Librarian librarian;

    @PostMapping(value = "/add",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public  String test() {
        librarian.readBok();
        return "";
    }


    public static void main(String[] args) {

    }

}



