package com.epam.task_01.entity.salad;

import com.epam.task_01.entity.vegetable.Vegetable;
import com.epam.task_01.logic.comporator.VegetableCaloriesComparator;
import com.epam.task_01.logic.validator.CalorieRangeValidator;

import java.util.ArrayList;
import java.util.TreeSet;

public class Salad {
    private final TreeSet<Vegetable> salad;
    private final CalorieRangeValidator validator = new CalorieRangeValidator();

    public Salad(VegetableCaloriesComparator comparator) {
        salad = new TreeSet<>(comparator);
    }

    public TreeSet<Vegetable> getSalad() {
        return salad;
    }

    public ArrayList<Vegetable> getVegetablesInCalorieRange(double lower, double upper) throws IllegalArgumentException {
        validator.validateCalorieRange(lower, upper);

        ArrayList<Vegetable> vegetables = new ArrayList<>();

        for (Vegetable vegetable : salad) {
            if (vegetable.getCaloriesAmount() >= lower && vegetable.getCaloriesAmount() <= upper) {
                vegetables.add(vegetable);
            }
        }
        return vegetables;
    }
}

