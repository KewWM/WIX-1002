package org.example;

public class WeightCalculator {
    private int age;
    private double height;
    private double rWeight;

    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
        rWeight = getRWeight();
    }

    public double getRWeight() {
        return (height - 100 + ((age / 10.0)) * 0.9);
    }

    @Override
    public String toString() {
        return "Age = " + age + "\n" +
                "Height = " + height + "\n" +
                "Recommend Weight = " + rWeight;

    }
}