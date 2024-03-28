package Manager;

import java.util.ArrayList;

import CarAtt.CarAtt;

public class Manager {
    
    private ArrayList<CarAtt> cars; 

    public Manager(){
        cars=new ArrayList<>();
    }

    public void addCar(CarAtt car){
        cars.add(car);
        System.out.println("Car added to stock.");
    }



    public void checkFromStock(int cbras){


        for(CarAtt car:cars){
            if(car.getYear()==cbras){
            System.out.println("Car in stock! "+ car);
            }
            else{
                System.out.println("The model: "+ cbras + " is not in stock.");
            }
        }



    }


    public void carLista(){
       System.out.println(cars);
    }

    public void printList(){
        if(cars.isEmpty()){
            System.out.println("Stock list is empty");
        }
        else{
        for(CarAtt car: cars){
            System.out.println(car);
            }
        }
    }




}
