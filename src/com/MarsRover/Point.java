package com.MarsRover;

/**
 * Created by hadoop on 25/6/14.
 */
public class Point {
    public int x ;
    public int y;
    public Orientation direction;
    public Point(int x, int y, Orientation direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
