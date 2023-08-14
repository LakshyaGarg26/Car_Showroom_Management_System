import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details(){
        System.out.println("NAME: "+car_name);
        System.out.println("COLOR: "+car_color);
        System.out.println("FUEL TYPE: "+car_fuel_type);
        System.out.println("PRICE: "+car_price);
        System.out.println("CAR TYPE: "+car_type);
        System.out.println("TRANSMISSION: "+car_transmission);
    }

    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("Car Name: ");
        car_name=sc.nextLine();
        System.out.print("Car Color: ");
        car_color=sc.nextLine();
        System.out.print("Car Fuel Type(Petrol/Diesel): ");
        car_fuel_type=sc.nextLine();
        System.out.print("Car Price: ");
        car_price=sc.nextInt();
        sc.nextLine();
        System.out.print("Car Type(Sedan/SUV/Hatchback): ");
        car_type=sc.nextLine();
        System.out.print("Transmission Type(Automatic/Manual): ");
        car_transmission=sc.nextLine();
        total_cars_in_stock++;
    }
}    