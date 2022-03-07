package com.epam.task_01.entity.salad;

import com.epam.task_01.entity.vegetable.Vegetable;
import com.epam.task_01.logic.comporator.VegetableCaloriesComparator;

import java.util.ArrayList;
import java.util.TreeSet;

public class Salad {
    private final TreeSet<Vegetable> salad;

    public Salad(VegetableCaloriesComparator comparator) {
        salad = new TreeSet<>(comparator);
    }

    public TreeSet<Vegetable> getSalad() {
        return salad;
    }

    public ArrayList<Vegetable> getVegetablesInCalorieRange(double lower, double upper) {
        if (lower <= 0 || upper <= 0 || lower > upper) {
            return null;
        } else {
            ArrayList<Vegetable> vegetables = new ArrayList<>();

            for (Vegetable vegetable : salad) {
                if (vegetable.getCaloriesAmount() >= lower && vegetable.getCaloriesAmount() <= upper) {
                    vegetables.add(vegetable);
                }
            }
            return vegetables;
        }
    }

}
