package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> listCars;

    public CarServiceImp() {
        listCars = new ArrayList<>();
        listCars.add(new Car(1L, "Car1", 111));
        listCars.add(new Car(2L, "Car2", 222));
        listCars.add(new Car(3L, "Car3", 333));
        listCars.add(new Car(4L, "Car4", 444));
        listCars.add(new Car(5L, "Car5", 555));
    }

    public List<Car> getListCars(int count) {
        if (count > 1) {
            return listCars.stream().limit(count).toList();
        }else {
            return null;
        }
    }

}
