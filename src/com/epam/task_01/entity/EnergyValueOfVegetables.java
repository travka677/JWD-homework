package com.epam.task_01.entity;

public enum EnergyValueOfVegetables {

    POTATO (77.0),
    CABBAGE (17.0),
    BROCCOLI (34.0),
    ONION (40.0);

    private final double VALUE;

    EnergyValueOfVegetables(double value) {
        VALUE = value;
    }

    public double getVALUE() {
        return VALUE;
    }
}
