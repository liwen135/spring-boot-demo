package com.ann.boot.controller;

import java.util.List;

import com.ann.boot.entity.User;
import com.ann.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * mvc url映射测试
 *
 *
 */
@Controller
@RequestMapping("/urlmapper")
public class URLMapperController {

    @Autowired
    UserService userService;


    @RequestMapping(path = "/user/all/*.json", method = RequestMethod.GET)
    @ResponseBody
    public List<User> allUser() {
        return userService.allUser();
    }


    @RequestMapping(path = "/user/{id}.json", method = RequestMethod.GET)
    @ResponseBody
    public User getById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping(path = "/{userId}.json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @GetMapping(value = "/consumes/test.json", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User forJson() {
        return userService.getUserById(1l);
    }

}
