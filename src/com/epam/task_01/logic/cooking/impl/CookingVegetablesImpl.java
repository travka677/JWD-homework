package com.epam.task_01.logic.cooking.impl;

import com.epam.task_01.logic.cooking.CookingVegetables;
import com.epam.task_01.entity.vegetable.VegetableToCook;

public class CookingVegetablesImpl implements CookingVegetables {

    @Override
    public void boil(VegetableToCook vegetable) {
        System.out.println("Boiling " + vegetable.getTITLE() + " for " + vegetable.getCOOKING_TIME() + " minutes");
    }

    @Override
    public void fry(VegetableToCook vegetable) {
        System.out.println("Frying " + vegetable.getTITLE() + " for " + vegetable.getCOOKING_TIME() + " minutes");
    }
}
