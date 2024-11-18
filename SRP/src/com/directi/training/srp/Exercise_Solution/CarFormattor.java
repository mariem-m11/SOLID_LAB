// CarFormattor.java
package com.directi.training.srp.exercise;

public class CarFormattor {
    private CarRepository carRepository;

    public CarFormattor(CarRepository repository) {
        this.carRepository = repository;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : carRepository.getCarsDb()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
