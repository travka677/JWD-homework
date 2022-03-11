package com.epam.task_01.main;

/*
 Task 8
 Определить иерархию овощей. Сделать салат. Посчитать калорийность.
 Провести сортировку овощей для салата на основе одного из параметров.
 Найти овощи в салате, соответствующие заданному диапазону калорийности.
 */

import com.epam.task_01.entity.salad.SaladCompositionPrinter;
import com.epam.task_01.logic.calories_calculator.CaloriesCalculator;
import com.epam.task_01.logic.comporator.VegetableCaloriesComparator;
import com.epam.task_01.entity.vegetable.*;
import com.epam.task_01.entity.EnergyValueOfVegetables;
import com.epam.task_01.entity.salad.Salad;
import com.epam.task_01.entity.сhef.Chef;


public class Main {
    public static void main(String[] args) {
        VegetableToCook potato = new Potato("Potato",
                300,
                EnergyValueOfVegetables.POTATO,
                10);
        Vegetable cabbage = new Cabbage("Cabbage",
                200,
                EnergyValueOfVegetables.CABBAGE);
        VegetableToCook broccoli = new Broccoli("Broccoli",
                150,
                EnergyValueOfVegetables.BROCCOLI,
                7);
        Vegetable onion = new Onion("Onion",
                50,
                EnergyValueOfVegetables.ONION);

        Chef chef = new Chef("Gordon");

        System.out.println("Start cooking a salad with our chef " + chef.getName());
        System.out.println();

        chef.wash(potato);
        chef.wash(cabbage);
        chef.wash(broccoli);
        chef.wash(onion);

        chef.boil(potato);
        chef.fry(broccoli);

        Salad simpleSalad = new Salad(new VegetableCaloriesComparator());

        simpleSalad.getSalad().add(potato);
        simpleSalad.getSalad().add(cabbage);
        simpleSalad.getSalad().add(onion);
        simpleSalad.getSalad().add(broccoli);

        System.out.println("\nOur salad consists of: ");
        SaladCompositionPrinter.print(simpleSalad.getSalad());

        System.out.println("\nVegetables in the calorie range:");
        try {
            SaladCompositionPrinter.print(simpleSalad.getVegetablesInCalorieRange(30, 200));
        } catch (IllegalArgumentException exception) {
            System.err.println("Incorrect arguments");
        }

        CaloriesCalculator calculator = new CaloriesCalculator();

        System.out.print("\nSalad calories = ");
        System.out.println(calculator.calculate(simpleSalad.getSalad()));
    }
}
