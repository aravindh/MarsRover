package com.MarsRover;

import java.util.ArrayList;
import java.util.LinkedList;


public class Rover {
    public Point current;
    private static ArrayList<Orientation> directions;

    static  {
        directions = new ArrayList<Orientation>();
        directions.add(Orientation.NORTH);
        directions.add(Orientation.EAST);
        directions.add(Orientation.SOUTH);
        directions.add(Orientation.WEST);

    }

    public Rover(int x, int y, Orientation direction) {
        current = new Point(x, y, direction);
    }

    public Point move() {
        switch (current.direction) {
            case NORTH:{
                current.y++;
                break;
            }
            case EAST:{
                current.x++;
                break;
            }
            case WEST:{
                current.x--;
                break;
            }
            case SOUTH:{
                current.y--;
                break;
            }
        }
        return current;

    }

    public Point turnLeft() {
        //directions.prev()
        int currentIdx = directions.indexOf(current.direction);
        int nxtIdx;
        if(currentIdx == 0) {
            nxtIdx = directions.size() -1;
        } else {
            nxtIdx = currentIdx -1;
        }
        current.direction = directions.get(nxtIdx);
        return current;
    }

    public Point turnRight()
    {
        int currentIdx = directions.indexOf(current.direction);
        int nxtIdx;
        if(currentIdx == (directions.size()-1)) {
            nxtIdx = 0;
        } else {
            nxtIdx = currentIdx  + 1;
        }
        current.direction = directions.get(nxtIdx);
        return current;
    }

    public String display() {
        String displayStr = "x: " + current.x + " y: " + current.y + " direction: " + current.direction;
        return displayStr;
    }
}
