package com.ayudantias.fruity_loops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ayudantias.fruity_loops.models.Item;



@Controller
public class ItemController {
    
    @GetMapping("/")
    public String root() {

        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("manzana",2));
        fruits.add(new Item("platano",2.4));
        fruits.add(new Item("mango",2.2));
        fruits.add(new Item("lucuma",3));
        fruits.add(new Item("pera",1.6));


        return "index.jsp";
    }
    
}
