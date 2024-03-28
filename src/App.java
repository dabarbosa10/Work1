import java.util.Scanner;

import CarAtt.CarAtt;
import Manager.Manager;


public class App {
    public static void main(String[] args) throws Exception {

    Manager listCars=new Manager();
    boolean flag=true;
    while(flag){
        CarAtt car=new CarAtt();
        Scanner nScan=new Scanner(System.in);
        System.out.println("Enter car brand: ");
        String br=nScan.nextLine();
        System.out.println("Enter car Model: ");
        String mod=nScan.nextLine();
        System.out.println("Enter car year: ");
        int yr=nScan.nextInt();
        car.setBrand(br);
        car.setModel(mod);
        car.setYear(yr);
        listCars.addCar(car);

        System.out.println("Do you want to continue? (y/n)");
        nScan.nextLine();
        String flagVal=nScan.nextLine();
        if(flagVal.equals("y")){
            flag=true;
            }
        else{
            flag=false;
            }

        }
       //listCars.carLista();
      // System.out.println("-----------------");
      // System.out.println("Enter brand to check: ");
      // Scanner bran=new Scanner(System.in);
     //  String cbr=bran.nextLine();
       listCars.checkFromStock(2000);
       //listCars.printList();
    }
}
