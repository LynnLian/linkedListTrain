package RailwayTrains;

public class Car {
    private double length;
    private int capacity;
    private Car next;

    public Car (double length, int capacity) {
        this.length = length;
        this.capacity = capacity;
    }

    public double getLength() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car getNext() {
        return next;
    }

    public void setNext(Car next) {
        this.next = next;
    }





}
