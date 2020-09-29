package com.fruit.fruit.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FirstAmount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private float amount;
    @OneToOne
//    @MapsId
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;
}
