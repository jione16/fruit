package com.fruit.fruit.Controller;

import com.fruit.fruit.Entity.FirstAmount;
import com.fruit.fruit.Entity.User;
import com.fruit.fruit.Repository.FirstAmountRepository;
import com.fruit.fruit.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "test")
public class TestingController {
    UserService userService;
    FirstAmountRepository firstAmountRepository;
    TestingController(UserService userService,FirstAmountRepository firstAmountRepository){
        this.userService = userService;
        this.firstAmountRepository = firstAmountRepository;
    }
    @GetMapping
    public Optional<User> test(){
        return userService.findById(18);
    }
    @GetMapping("/test")
    public void zz(){
         test2();
    }


    private void test2(){
        User user = userService.get(18);
        FirstAmount firstAmount = new FirstAmount();
        firstAmount.setAmount(12345678);
        firstAmount.setUser(user);
        user.setFirstAmount(firstAmount);
        userService.register(user);
    }
}
