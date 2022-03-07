package com.epam.task_01.logic.calories_calculator;

import com.epam.task_01.entity.vegetable.Vegetable;
import java.util.ArrayList;
import java.util.TreeSet;

public class CaloriesCalculator {

    public double calculate(Vegetable vegetable) {
        final int HUNDRED_GRAMS = 100;
        double amount;

        amount = vegetable.getWeight() * vegetable.getCALORIES_IN_100_GRAMS() / HUNDRED_GRAMS;
        return amount;
    }

    /*
    Перегруженный метод calculate для подсчета калорий в салате, который вызывает внутри цикла
    метод calculate(Vegetable vegetable)
     */
    public double calculate(TreeSet<Vegetable> vegetables) {
        double amount = 0;

        for (Vegetable vegetable : vegetables) {
            amount += calculate(vegetable);
        }

        return amount;
    }

}
