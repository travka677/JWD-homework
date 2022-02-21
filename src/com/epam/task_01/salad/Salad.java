package com.epam.task_01.salad;

import com.epam.task_01.entity.vegetable.Vegetable;

import java.util.ArrayList;

public class Salad {
    private ArrayList<Vegetable> salad;

    public Salad() {
        salad = new ArrayList<>();
    }

    public ArrayList<Vegetable> getSalad() {
        return salad;
    }

}
