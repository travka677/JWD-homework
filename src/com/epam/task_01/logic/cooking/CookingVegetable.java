package com.epam.task_01.logic.cooking;

import com.epam.task_01.entity.vegetable.VegetableToCook;

public interface CookingVegetable {
    void boil(VegetableToCook vegetable);
    void fry(VegetableToCook vegetable);
}
