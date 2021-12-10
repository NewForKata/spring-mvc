package web.dao;

import web.model.Car;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Audi Q8", 2020, 999999));
        carList.add(new Car("Bmw x6", 2019, 888888));
        carList.add(new Car("Mercedes Benz", 2018, 777777));
        carList.add(new Car("Audi A6", 2017, 666666));
        carList.add(new Car("Lada Priora", 2016, 555555));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
