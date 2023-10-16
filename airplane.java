/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

import java.util.Scanner;

/**
 *
 * @author canif
 */
public class airplane extends Vehicle implements Flyable {
    
    private int altitude;
    
    public airplane (int speed, int direction , String type , String make, int numPassenger , int altitude){ 
    
    setSpeed(speed);
    setDirection(direction);
    setType(type);
    setMake(make);
    setNumPassengers(numPassenger);
    setNumWheels(3);
    setNumWings(2);
    this.altitude = altitude;
    
    }
    
    
    public void changeAltitude(float change){
        
        float altitude = change * getSpeed() / 2;        
        if (altitude<0){altitude = altitude*(-1);}

        
    }           
    public float getAltitude(){

        System.out.println("current altitude is " + altitude);
        return altitude;
    }
    
    public void accelerate(float speed){
        
        if (getSpeed()>0){
        
            System.out.println("we are gettin fasteeerrr");
        }
        
    
    }   
    public void turn(float angle){
        
        System.out.println("which direction ");
        Scanner input = new Scanner (System.in);
        String direction = input.nextLine();
        System.out.println("you are turning " + direction + " direction with "+ angle + " angle");
        
    
    }
    public void brake(){
        
        
        System.out.println("it stopped");
        setSpeed(0);
    
    }
    

    
    
    
    
    
}
