package mygarrage;

/**
 *
 * @author Ivcho
 */
public class Garrage {
    static int countGarrage;
    private String brand;
    private String model;
    private String colour;
    private int year;
    
    
    public String getBrand(){
        return brand;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }
    
    public String getModel(){
        return model;
    }
    public void setModel (String model){
        this.model = model;
    }
    
    public String getColour(){
        return colour;
    }
    public void setColour (String colour){
        this.colour = colour;
    }
    
    public int getYear() {
        return year;
    }
    public void setYear (int year){
        this.year = year;
    }
    
    public Garrage(String brand, String model, String colour, int year){
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.year = year;
        countGarrage += 1;
    }
}
