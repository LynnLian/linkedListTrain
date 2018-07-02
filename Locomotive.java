package RailwayTrains;

public class Locomotive {
    private double length;
    private int type;
    private Car first;


    public Locomotive(double length, int type) {
        this.length = length;
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public int getType() {
        return  type;
    }

    public Car getFirst() {
        return first;
    }

    public void setFirst(Car first) {
        this.first = first;
    }



}
