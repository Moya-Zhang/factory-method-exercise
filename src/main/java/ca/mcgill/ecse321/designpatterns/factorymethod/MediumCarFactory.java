package ca.mcgill.ecse321.designpatterns.factorymethod;

public class MediumCarFactory extends CarFactory {
    @Override
    public Car makeCar() {
        return new MediumCar();
    }
}
