package br.pucrs.gcs;

import org.w3c.dom.ranges.Range;

public class App {

    public static void main(String[] args){
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(2,0,"N");

       if (validateInitialPosition(plateau, rover)){
         // process valid input
       };
    }

    public static boolean validateInitialPosition(Plateau plateau, Rover rover){
        if ( rover.getX() < 0 || rover.getX() > plateau.getX() ) {
            System.out.println("Rover X value invalid!");
            return false;
        }

        if ( rover.getY() < 0 || rover.getY() > plateau.getY() ) {
            System.out.println("Rover Y value invalid!");
            return false;
        }

        return true;
    }
}
