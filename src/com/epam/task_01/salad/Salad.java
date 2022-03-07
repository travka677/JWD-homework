package com.epam.task_01.salad;

import com.epam.task_01.entity.vegetable.Vegetable;
import com.epam.task_01.logic.comporator.VegetableCaloriesComparator;

import java.util.TreeSet;

public class Salad {
    private final TreeSet<Vegetable> salad;

    public Salad(VegetableCaloriesComparator comparator) {
        salad = new TreeSet<>(comparator);
    }

    public TreeSet<Vegetable> getSalad() {
        return salad;
    }

}
