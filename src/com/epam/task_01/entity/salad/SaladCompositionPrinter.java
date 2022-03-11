package com.epam.task_01.entity.salad;

import com.epam.task_01.entity.vegetable.Vegetable;
import java.util.Collection;

public class SaladCompositionPrinter {

    public static void print(Collection<Vegetable> salad) {
        for (Vegetable vegetable : salad) {
            System.out.println(vegetable);
        }
    }
}
