package com.MarsRover;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("start location: 1,2,N");

        //Rover rover =  new Rover(1, 2, Orientation.NORTH);
        Rover rover =  new Rover(3, 3, Orientation.EAST);
        System.out.println("instructions: ");
        //String instructions = "LMLMLMLMM";
        String instructions = "MMRMMRMRRM";
        for (char cmd : instructions.toCharArray()) {
            switch(cmd) {
                case 'L': {
                    rover.turnLeft();
                    System.out.println("L " + rover.display());
                    break;
                }
                case 'R': {
                    rover.turnRight();
                    System.out.println("R " + rover.display());
                    break;
                }
                case 'M': {
                    rover.move();
                    System.out.println("M " + rover.display());
                    break;
                }
            }
        }

    }
}
