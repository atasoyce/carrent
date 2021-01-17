package ca;

import java.util.ArrayList;

public class CarManager {
    //region Instance Variables
    ArrayList<Car> _Cars;
    //endregion


    //region Constructors
    public CarManager() {
        _Cars = new ArrayList<Car>();
    }
    //endregion

    //region Public Methods
    void addCar(String brand, String type, short hp) {
        Car newCar = new Car(brand, type, hp);
        _Cars.add(newCar);
    }

    public String[] listAllCars() {
        String[] allCars = new String[_Cars.size()];
        for (int i = 0; i < allCars.length; i++) {
            allCars[i] = _Cars.get(i).getSpecification();
        }
        return allCars;
    }

    public String[] listRentedCars() {
        ArrayList<Car> rentedCars = new ArrayList<Car>();

        for (int i = 0; i < _Cars.size(); i++) {
            if(_Cars.get(i).getRent() == true) {
                rentedCars.add(_Cars.get(i));
            }
        }

        String[] rentedCarsString = new String[rentedCars.size()];
        for (int i = 0; i < rentedCarsString.length; i++) {
            rentedCarsString[i] = rentedCars.get(i).getSpecification();
        }

        return rentedCarsString;
    }

    public String[] listAvailableCars() {
        ArrayList<Car> availableCars = new ArrayList<Car>();

        for (int i = 0; i < _Cars.size(); i++) {
            if(_Cars.get(i).getRent() == false) {
                availableCars.add(_Cars.get(i));
            }
        }

        String[] availableCarsString = new String[availableCars.size()];
        for (int i = 0; i < availableCarsString.length; i++) {
            availableCarsString[i] = availableCars.get(i).getSpecification();
        }

        return availableCarsString;
    }
    //endregion

}

