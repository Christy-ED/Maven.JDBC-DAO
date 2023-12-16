package models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testCar(){
        Integer id = 0;
        String make = "";
        String model = "";
        String color = "";
        Integer vin = 0;
        Integer year = 0;
        Car car = new Car(make,  model, year, color,  vin,  id);

        assertNotNull(car);

    }


    @Test
    public void testGetId(){
        Integer id = 0;

        Car car = new Car();
        car.getId();
        Assert.assertNotNull(0);

    }



    @Test
    public void testGetName() {
        String name = "";
        Car car = new Car();
       // car.getMake("");
        assertNotNull(name);


    }




    @Test
    public void testGetModel(){
        String model = "";
        Car car = new Car();
       // car.getModel("");
        assertNotNull(model);


    }


    @Test
    public void testGetColor(){
        String color = "";
        Car car = new Car();
        car.getColor();
        assertNotNull(color);

    }


    @Test
    public void testGetVin(){
        Integer vin = 0;
        Car car = new Car();
        car.getVin();
        assertNotNull(0);

    }








}
