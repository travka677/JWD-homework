package com.epam.task_01.logic.calories_calculator;

import com.epam.task_01.entity.vegetable.Vegetable;
import java.util.TreeSet;

public class CaloriesCalculator {

    public double calculate(TreeSet<Vegetable> vegetables) {
        double amount = 0;

        for (Vegetable vegetable : vegetables) {
            amount += (vegetable.getWeight() * vegetable.getCALORIES_IN_100_GRAMS() / vegetable.getHUNDRED_GRAMS());
        }

        return amount;
    }

}
