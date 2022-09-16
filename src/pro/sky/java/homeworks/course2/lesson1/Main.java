package pro.sky.java.homeworks.course2.lesson1;

public class Main {
    public static void main(String[] args) {


        Vehicle car = new Car("car1", 4);
        Vehicle car2 = new Car("car2", 4);

        Vehicle truck = new Truck("truck1", 6);
        Vehicle truck2 = new Truck("truck2", 8);


        Vehicle bicycle = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check0(car);
        station.check0(car2);

        station.check0(bicycle);
        station.check0(bicycle2);

        station.check0(truck);
        station.check0(truck2);
    }
}
