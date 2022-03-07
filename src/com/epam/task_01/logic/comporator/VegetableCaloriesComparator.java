package com.epam.task_01.logic.comporator;

import com.epam.task_01.entity.vegetable.Vegetable;

import java.util.Comparator;

public class VegetableCaloriesComparator implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable veg1, Vegetable veg2) {
        return (int) (veg1.getCALORIES_IN_100_GRAMS() - veg2.getCALORIES_IN_100_GRAMS());
    }
}
