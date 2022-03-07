package com.epam.task_01.logic.cleaning.impl;

import com.epam.task_01.logic.cleaning.CleaningVegetable;
import com.epam.task_01.entity.vegetable.Vegetable;

public class CleaningVegetableImpl implements CleaningVegetable {

    @Override
    public void wash(Vegetable vegetable) {
        System.out.println("Washing the " + vegetable.getTITLE());
    }
}
