package com.fruit.fruit.Service;

import com.fruit.fruit.Entity.FirstAmount;
import com.fruit.fruit.Repository.FirstAmountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FirstAmountService {
    FirstAmountRepository firstAmountRepository;
    FirstAmountService(FirstAmountRepository firstAmountRepository) {
        this.firstAmountRepository = firstAmountRepository;
    }

    public FirstAmount save(FirstAmount firstAmount) {
        return firstAmountRepository.save(firstAmount);
    }
    public Optional<FirstAmount> get(long id){
        return firstAmountRepository.findById(id);
    }
}
