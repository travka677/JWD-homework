package com.epam.task_01.entity.vegetable;

import com.epam.task_01.entity.EnergyValueOfVegetables;

import java.util.Objects;

public abstract class VegetableToCook extends Vegetable {
    private final int COOKING_TIME;

    public VegetableToCook(String title, double weight, EnergyValueOfVegetables vegetable, int cookingTime) {
        super(title, weight, vegetable);
        this.COOKING_TIME = cookingTime;
    }

    public int getCOOKING_TIME() {
        return COOKING_TIME;
    }

    @Override
    public String toString() {
        return getTitle() + "{" +
                "CALORIES_IN_100_GRAMS=" + getCALORIES_IN_100_GRAMS() +
                ", caloriesAmount=" + getCaloriesAmount() +
                ", weight=" + getWeight() +
                ", COOKING_TIME=" + COOKING_TIME +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VegetableToCook that = (VegetableToCook) o;
        return COOKING_TIME == that.COOKING_TIME;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), COOKING_TIME);
    }
}
