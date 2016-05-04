package me.puras.boot.controller;

import me.puras.boot.domain.User;
import me.puras.boot.service.UserService;
import net.mooko.common.json.Response;
import net.mooko.common.json.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by puras on 16/5/4.
 */
@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Response list() {
        List<User> list = userService.findAll();
        return ResponseHelper.createSuccessResponse(list);
    }
}
