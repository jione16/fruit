package com.fruit.fruit.Service;

import com.fruit.fruit.Entity.User;
import com.fruit.fruit.Repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    UserRepository userRepository;
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User register(User user){
        return userRepository.save(user);
    }

    public Optional<User> findById(long id){
        return userRepository.findById(id);
    }
    public User get(long id){
        return userRepository.getOne(id);
    }
}
