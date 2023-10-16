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
public class ship extends Vehicle implements Sailable  {


    public ship(int speed, int direction , String type , String make , int numPassengers ){
    
    setSpeed(speed);
    setDirection(direction);
    setType(type);
    setMake(make);
    setNumPassengers(numPassengers);
    
    numWheels = 0;
    numWings = 0;

    
    }
    
        
    //ship is hoisted by default
     private int hoist = 1;
     
    @Override
    public void hoistSail(){
    
        System.out.println("leetsss gooooo");
        
        Scanner input = new Scanner(System.in);
        System.out.println("what speed level do you want to reach? ");
        setSpeedLimit(input.nextFloat());
        hoist = 1;
        for (float i = getSpeed(); i < getSpeedLimit(); i+=10 ){
        
                System.out.println("current speed is " + i);
                setSpeed(i);
        }
        
    }
    
    @Override
    public void lowerSail(){
        System.out.println("we getting sloweerrr");
         
        for (float i = getSpeed(); i >-1 ; i-=10 ){
        
                System.out.println("current speed is " + i);
                setSpeed(i);
        }
        
        hoist = 0;
    }
    @Override
    public boolean isSailHoisted(){
        if (hoist== 0){
            
            System.out.println("hoisted hehe");
            return false;
        }else{
            
    return true;
        }}
    @Override
    public void landHo(){
        
        if( hoist == 1 && getSpeed() == 0){
            System.out.println("we are landed.HO");
        
    }

    
}
    
}
