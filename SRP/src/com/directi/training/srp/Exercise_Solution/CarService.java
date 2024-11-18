// CarService.java
package com.directi.training.srp.exercise;

public class CarService {
    private CarRepository carRepository;
    private CarFormattor carFormattor;
    private CarComparator carComparator;

    public CarService(CarRepository repository, CarFormattor formattor, CarComparator comparator) {
        this.carRepository = repository;
        this.carFormattor = formattor;
        this.carComparator = comparator;
    }

    public String getCarsNames() {
        return carFormattor.getCarsNames();
    }

    public Car getBestCar() {
        return carComparator.getBestCar();
    }
}
