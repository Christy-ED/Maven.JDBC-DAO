package daos;

import models.Car;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


import static org.junit.Assert.assertNotNull;

public  class CarDoasTest {

    @Test
    public void testFindById(){

    CarDao car = new CarDao();
     Integer id = 8 ;
     Car actual = car.findById(id);
     Assert.assertNotNull(actual);
    }

    @Test
    public void testfindAll(){
        CarDao car = new CarDao();
        List<Car> carList = car.findAll();
        Assert.assertTrue(!carList.isEmpty());

    }


    @Test
    public void testCarUpdate(){
        CarDao car = new CarDao();
        Integer id = 9;
        String make = "toyato";
        String model = "SUV";
        String color = "white";
        Integer vin = 7867891;
        Integer year = 2023;
        Car dto = new Car(make, model, year, color, vin, id);
        assertNotNull(car.update(dto));

    }

    @Test
    public void testCreate(){
        CarDao car = new CarDao();
        Integer id = 7;
        String make = "toyato";
        String model = "SUV";
        String color = "white";
        Integer vin = 7867891;
        Integer year = 2021;
        Car dto = new Car(make, model, year, color, vin, id);
        assertNotNull(car.create(dto));

    }

}
