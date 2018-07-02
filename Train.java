package RailwayTrains;

public class Train {
    private Locomotive locomotive;

    public Train(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public boolean hasCars() {
        return locomotive.getFirst() != null;
    }

    public void add(int index, Car car) {
        if (index == 0) {
            locomotive.setFirst(car);
        } else {
            Car current = locomotive.getFirst();

            for (int i = 1; i < index; i++) {
                current = current.getNext();
            }

            car.setNext(current.getNext());

            current.setNext(car);

        }
    }

    public int getPassengers() {
        Car current = locomotive.getFirst();
        int num = 0;

        while (current != null) {
            num = num + current.getCapacity();
            current = current.getNext();
        }

        return num;
    }

    public double getLength() {
        Car current = locomotive.getFirst();
        double length = 0;

        while (current != null) {
            length = length + current.getLength();
            current.getNext();
        }

        return length;
    }

    public Car removeFirst() {
        Car removedCar = locomotive.getFirst();

        locomotive.setFirst(removedCar.getNext());

        return removedCar;

    }

    public void relink(Train train2) {
        Car appendCar = train2.locomotive.getFirst();

        Car currentTrainCar = locomotive.getFirst();

        if (currentTrainCar == null) {
            locomotive.setFirst(appendCar);
        } else {
            while (currentTrainCar.getNext() != null) {
                currentTrainCar = currentTrainCar.getNext();
            }

            currentTrainCar.setNext(appendCar);
        }

        train2.locomotive.setFirst(null);
    }

    public void revert() {
        Car pre = null;
        Car cur = locomotive.getFirst();
        Car next = cur.getNext();

        while (cur != null) {
            cur.setNext(pre);
            pre = cur;
            cur = next;
            if (cur != null) {
                next = cur.getNext();
            }

        }

        locomotive.setFirst(pre);
    }

    public String toString() {
        double locomotiveLength = locomotive.getLength();
        int locomotiveType = locomotive.getType();

        System.out.println("The data of this locomotive is: \n" + "Length: " + locomotiveLength + " meters; " + "Type: " + locomotiveType);

        double carLength;
        int carCapacity;

        if (hasCars()) {

            String info = "";
            int numCars = 0;
            Car current = locomotive.getFirst();

            while (current != null) {
                numCars++;
                carLength = current.getLength();
                carCapacity = current.getCapacity();

                info = info + numCars + ". " + "Length: " + carLength + " meters; " + "Capacity: " + carCapacity + " ;\n";

                current = current.getNext();

            }
            return "And this train has " + numCars + " cars. And the data of each car is listed here: \n" + info;

        } else {
            return "And this train has no cars";
        }

    }
}
