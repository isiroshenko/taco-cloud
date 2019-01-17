package com.tacocloud.data;

import com.tacocloud.model.Ingredient;
import com.tacocloud.model.Taco;

import java.util.List;

public interface TacoRepository {

    Taco save(Taco design, List<Ingredient> ingredientList);

}
