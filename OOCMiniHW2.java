/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        airplane airplane = new airplane(300,30,"airbus","300",300,2500);        
        airplane.accelerate(0);
        airplane.brake();
        airplane.changeAltitude(250);
        airplane.getAltitude();
        airplane.getDirection();
        airplane.getMake();
        airplane.getNumPassengers();
        airplane.getNumSails();
        airplane.getNumWheels();
        airplane.getNumWings();
        airplane.getSpeed();
        airplane.setSpeedLimit(0);
        airplane.getType();
        
        
        
    
    }}
