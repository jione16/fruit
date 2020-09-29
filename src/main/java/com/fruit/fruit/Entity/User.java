package com.fruit.fruit.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank
    @Column(unique = true)
    private String username;
    @NotBlank
    private String password;
    private boolean enabled = true;
    private String role = "user";
    @Temporal(TemporalType.DATE)
    private Date create_at = new Date();
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private FirstAmount firstAmount;

}
