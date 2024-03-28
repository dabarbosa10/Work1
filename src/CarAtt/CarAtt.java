package CarAtt;


public class CarAtt {
    
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String Brand) {
        this.brand = Brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String Model) {
       this. model = Model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int Year) {
       this.year = Year;
    }
    @Override
    public String toString() {
        return ("Brand=" + brand + ", model=" + model + ", year=" + year );
    }

    


}
