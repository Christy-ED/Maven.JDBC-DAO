package daos;

import models.Car;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public  class CarDoasTest {

    @Test
    public void testFindById(){

    CarDao car = new CarDao();
     Integer id = 8;
     Car actual = car.findById(id);
     Assert.assertNotNull(actual);
    }

    @Test
    public void testfindAll(){
        CarDao car = new CarDao();
        List<Car> carList = car.findAll();
        Assert.assertTrue(!carList.isEmpty());

    }


}
