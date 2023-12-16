package daos;

import Main.ConnectionFactory;
import models.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class CarDaos {

    public Car findById(int id){
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id=" + id);

            if(rs.next())
            {
                ar car = new Car();
                car.setId(rs.getInt("id"));
                car.setMake(rs.getString("make"));
                car.setModel(rs.getString("model"));
                car.setYear(rs.getInt("year"));
                car.setVin(rs.getInt("vin"));

                return car;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public List findAll(){
        return null;
    }

    public Car update(Car dto){
        return null;
    }

    public Car create(Car dto){
        return null;
    }

    public void delete(int id){

    }

}
