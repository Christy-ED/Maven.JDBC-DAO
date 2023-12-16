package daos;

import Main.ConnectionFactory;
import models.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class CarDaos {

    public Car findById(int id){
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM strorage WHERE id=" + id);

            if(rs.next())
            {
                Car car = new Car();
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

        Connection connection = ConnectionFactory.getConnection();
         List<Car> carlist = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM strorage");

            while (rs.next())
            {
                Car car = new Car();
                car.setId(rs.getInt("id"));
                car.setMake(rs.getString("make"));
                car.setModel(rs.getString("model"));
                car.setYear(rs.getInt("year"));
                car.setVin(rs.getInt("vin"));

              carlist.add(car);
            }



        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return carlist;
    }

    public Car update(Car dto){

        Connection connection = ConnectionFactory.getConnection();

        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE strorage SET make=?, pass=?, model=? WHERE id=?");
            ps.setString(1, dto.getMake());
            ps.setString(2, user.getPass());
            ps.setInt(3, user.getAge());
            ps.setInt(4, user.getId());
            int i = ps.executeUpdate();

            if(i == 1) {
                return true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
    }

    public Car create(Car dto){
        return null;
    }

    public void delete(int id){

    }

}
