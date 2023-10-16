/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author canif
 */
public class car extends Vehicle implements Drivable{
    
    int numWheels = 4;
    int numWings = 0;
    int numSails = 0;

    public car(int speed, int direction , String type , String make , int numPassengers , int speedLimit) {
    setSpeed(speed);
    setDirection(direction);
    setType(type);
    setMake(make);
    setNumPassengers(numPassengers);        
    setSpeedLimit(speedLimit);
    
        
    }
    
    
        public void accelerate(float speed){
        
            System.out.println("it is geting fasterr");
        for (float i = 0 ; i < speed ; i+=10){
            System.out.println("current speed : " + i); 
        
        
        }
        
        
        
        
        
        
        }
        public void brake(){
            System.out.println("it is stopping now!!");
            for ( float i = getSpeed() ; i < 0 ; i -= 10 ){
                System.out.println("current speed : " + i );
            
            
            
            }
        }
        public void turn(float angle){
        
            System.out.println("we are turning to " + angle + "degre!!!");
        
        }
        
        
    
    
    
    
    
    
    
}
