package models;

public class Car {

    private Integer id;
    private String name;
    private String model;
    private String color;
    private Integer vin;
    private Integer year;

    public Car(){

    }

    public Car(String name, String model,Integer year,String color, Integer vin, Integer id){
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.year = year;
    }

    public Integer getId(Integer id) {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName(String s) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel(String s) {
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
