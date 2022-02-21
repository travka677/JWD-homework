package com.epam.task_01.logic.calories_calculator;

import com.epam.task_01.entity.vegetable.Vegetable;
import com.epam.task_01.salad.Salad;

import java.util.ArrayList;

public class CaloriesCalculator {

    public double calculate(Vegetable vegetable) {
        double amount;
        final int HUNDRED_GRAMS = 100;

        amount = vegetable.getWeight() * vegetable.getVegetable().getVALUE() / HUNDRED_GRAMS;
        return amount;
    }

    public double calculate(ArrayList<Vegetable> salad) {
        double amount = 0;

        for (Vegetable vegetable : salad) {
            amount += calculate(vegetable);
        }

        return amount;
    }

}
