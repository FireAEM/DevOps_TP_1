package com.example.devops_tp1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private List<Car> cars = new ArrayList<>();

    public CarController() {
        cars.add(new Car("11AA22", "Ferrari", 100));
        cars.add(new Car("22BB33", "BMW", 80));
        cars.add(new Car("33CC44", "Peugeot", 30));
    }

    @GetMapping
    public List<Car> getCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (!car.isRented()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    @GetMapping("/{plateNumber}")
    public Car getCar(@PathVariable String plateNumber) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                return car;
            }
        }
        return null;
    }

    @PutMapping("/{plateNumber}")
    public String RentOrReturnCar(@PathVariable String plateNumber, @RequestParam boolean rent, @RequestBody(required = false) Dates dates) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                if (rent) {
                    if (car.isRented()) {
                        return "La voiture est déjà louée.";
                    }
                    if (dates == null || dates.getBegin() == null || dates.getEnd() == null) {
                        return "Les dates de location sont requises.";
                    }

                    car.setRented(true);
                    car.setRentBegin(dates.getBegin());
                    car.setRentEnd(dates.getEnd());
                    return "La voiture a été louée.";
                } else {
                    if (!car.isRented()) {
                        return "La voiture n'est pas louée.";
                    }

                    car.setRented(false);
                    car.setRentBegin(null);
                    car.setRentEnd(null);
                    return "La voiture a été retournée.";
                }
            }
        }
        return "Voiture non trouvée.";
    }
}
