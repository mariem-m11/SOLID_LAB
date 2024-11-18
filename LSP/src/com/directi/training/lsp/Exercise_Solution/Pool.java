package com.directi.training.lsp.exercise;

public class Pool {
    public void run() {
        IDuck donaldDuck = new Duck();
        IDuck electricDuck = new ElectronicDuck();
        ((ElectronicDuck) electricDuck).turnOn();  
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(IDuck... ducks) {
        for (IDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(IDuck... ducks) {
        for (IDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
