package com.epam.task_01.logic.validator;

public class CalorieRangeValidator {

    public void validateCalorieRange(double lower, double upper) throws IllegalArgumentException {
        if (lower <= 0 || upper <= 0 || lower > upper) {
            throw new IllegalArgumentException();
        }
    }
}
