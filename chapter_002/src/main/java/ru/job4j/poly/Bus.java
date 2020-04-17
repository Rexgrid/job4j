package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {

    }

    @Override
    public void passanger(int pas) {

    }

    @Override
    public double fillUp(int fuel) {
        double cost = 25.20;
        return fuel * cost;
    }
}
