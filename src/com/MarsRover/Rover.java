package com.MarsRover;

public class Rover {
    public Point current;

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
        current.direction = current.direction.left();
        return current;
    }

    public Point turnRight()
    {
        current.direction = current.direction.right();
        return current;
    }

    public String display() {
        String displayStr = "x: " + current.x + " y: " + current.y + " direction: " + current.direction;
        return displayStr;
    }
}
