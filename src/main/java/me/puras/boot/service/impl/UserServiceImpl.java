package me.puras.boot.service.impl;

import me.puras.boot.domain.User;
import me.puras.boot.persistence.UserRepository;
import me.puras.boot.service.UserService;
import net.mooko.common.persistence.CrudRepository;
import net.mooko.common.service.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by puras on 16/5/4.
 */
@Service
@Transactional
public class UserServiceImpl extends CrudServiceImpl<User> implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public CrudRepository<User> getRepository() {
        return userRepository;
    }
}
