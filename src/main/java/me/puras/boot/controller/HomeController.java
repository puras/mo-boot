package me.puras.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by puras on 16/5/3.
 */
@RestController
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home() {
        return "Hello World";
    }
}
