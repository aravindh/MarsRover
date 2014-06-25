package com.MarsRover;

/**
 * Created by hadoop on 25/6/14.
 */
public enum Orientation {
    NORTH {
        @Override
        public Orientation left(){
            return WEST;
        }
        @Override
        public Orientation right(){
            return EAST;
        }
    },
    EAST{
        @Override
        public Orientation left(){
            return NORTH;
        }
        @Override
        public Orientation right(){
            return SOUTH;
        }
    },
    WEST{
        @Override
        public Orientation left(){
            return SOUTH;
        }
        @Override
        public Orientation right(){
            return NORTH;
        }
    },
    SOUTH{
        @Override
        public Orientation left(){
            return EAST;
        }
        @Override
        public Orientation right(){
            return WEST;
        }
    };
    public abstract Orientation left();
    public abstract Orientation right();
}
