package com.bootcampexercise.module9;

// this class stores person details and calculates BMI
public class Person {

    private int weight;
    private float height;

    // getter and setter for weight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // getter and setter for height
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // method to calculate BMI and return category
    public String getBodyMassIndex(float height, int weight) {

        // check for invalid values
        if (height <= 0 || weight <= 0) {
            return "Invalid input";
        }

        // basic max limits check
        if (height > 3 || weight > 300) {
            return "Invalid input";
        }

        // BMI calculation
        float bmi = weight / (height * height);

        // return BMI category
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}