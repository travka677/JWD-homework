package com.epam.task_01.entity.vegetable;

import com.epam.task_01.entity.EnergyValueOfVegetables;

import java.util.Objects;

public abstract class Vegetable {
    private EnergyValueOfVegetables vegetable;
    private String title;
    private double caloriesAmount;
    private double weight;

    public Vegetable(String title, double weight, EnergyValueOfVegetables vegetable) {
        this.title = title;
        this.weight = weight;
        this.vegetable = vegetable;
    }

    public Vegetable() {

    }

    public EnergyValueOfVegetables getVegetable() {
        return vegetable;
    }

    public String getTitle() {
        return title;
    }

    public void setCaloriesAmount(double caloriesAmount) {
        this.caloriesAmount = caloriesAmount;
    }

    public double getCaloriesAmount() {
        return caloriesAmount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Double.compare(vegetable.caloriesAmount, caloriesAmount) == 0 && Double.compare(vegetable.weight, weight) == 0 && title.equals(vegetable.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, caloriesAmount, weight);
    }
}
