package com.epam.task_01.entity.сhef;

import com.epam.task_01.entity.vegetable.Vegetable;
import com.epam.task_01.entity.vegetable.VegetableToCook;
import com.epam.task_01.logic.cleaning.CleaningVegetable;
import com.epam.task_01.logic.cooking.CookingVegetable;

import java.util.Objects;

public class Chef implements CleaningVegetable, CookingVegetable {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void wash(Vegetable vegetable) {
        System.out.println("Washing the " + vegetable.getTitle());
    }

    @Override
    public void boil(VegetableToCook vegetable) {
        System.out.println("Boiling " + vegetable.getTitle() + " for " + vegetable.getCOOKING_TIME() + " minutes");
    }

    @Override
    public void fry(VegetableToCook vegetable) {
        System.out.println("Frying " + vegetable.getTitle() + " for " + vegetable.getCOOKING_TIME() + " minutes");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chef chef = (Chef) o;
        return Objects.equals(name, chef.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
