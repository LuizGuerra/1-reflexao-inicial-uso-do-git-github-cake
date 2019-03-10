package br.pucrs.gcs;

public class Rover {

    private final int x;
    private final int y;
    private String facing;

    public Rover(int x, int y, String facing) {
        this.facing = facing;
        this.x = x;
        this.y = y;
    }

    public String getFacingCoordinate() {
        return this.facing;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}