package com.epam.task_01.entity.vegetable;

import com.epam.task_01.entity.EnergyValueOfVegetables;

import java.util.Objects;

public abstract class Vegetable {
    private final int HUNDRED_GRAMS = 100;
    private final double CALORIES_IN_100_GRAMS;
    private String title;
    private double caloriesAmount;
    private double weight;

    public Vegetable(String title, double weight, EnergyValueOfVegetables vegetable) {
        this.title = title;
        this.weight = weight;
        CALORIES_IN_100_GRAMS = vegetable.getVALUE();
        caloriesAmount = weight * CALORIES_IN_100_GRAMS / HUNDRED_GRAMS;
    }

    public double getCALORIES_IN_100_GRAMS() {
        return CALORIES_IN_100_GRAMS;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getHUNDRED_GRAMS() {
        return HUNDRED_GRAMS;
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

    @Override
    public String toString() {
        return title + "{" +
                "CALORIES_IN_100_GRAMS=" + CALORIES_IN_100_GRAMS +
                ", caloriesAmount=" + caloriesAmount +
                ", weight=" + weight +
                '}';
    }
}
