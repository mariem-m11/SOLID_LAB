// CarComparator.java
package com.directi.training.srp.exercise;

public class CarComparator {
    private CarRepository carRepository;

    public CarComparator(CarRepository repository) {
        this.carRepository = repository;
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : carRepository.getCarsDb()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
