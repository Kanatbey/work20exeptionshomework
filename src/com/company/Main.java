package com.company;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws RuntimeException {
        try(Car car = new Car()){
           car.drive();
           try {
               throw new RuntimeException();
           }catch (RuntimeException e){
               System.out.println("Runtime Exception ignor kylyndy");
           }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
