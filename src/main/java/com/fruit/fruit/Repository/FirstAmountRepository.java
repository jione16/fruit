package com.fruit.fruit.Repository;

import com.fruit.fruit.Entity.FirstAmount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstAmountRepository extends JpaRepository<FirstAmount,Long> {
}
