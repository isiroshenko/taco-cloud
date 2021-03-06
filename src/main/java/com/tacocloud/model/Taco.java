package com.tacocloud.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private LocalDateTime createdAt;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @ManyToMany(targetEntity=Ingredient.class)
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

    void createdAt(){
        this.createdAt = LocalDateTime.now();
    }
}
