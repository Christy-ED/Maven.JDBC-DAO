package models;

public class Car {

    private Integer id;
    private String make;
    private String model;
    private String color;
    private Integer vin;
    private Integer year;

    public Car(){

    }

    public Car(String make, String model,Integer year,String color, Integer vin, Integer id){
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.year = year;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = this.id;
    }

    public String getMake() {
        return make;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setMake(String name) {
        this.make = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getVin() {
        return vin;
    }

    public void setVin(Integer vin) {
        this.vin = vin;
    }
}
