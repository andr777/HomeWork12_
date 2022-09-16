package pro.sky.java.homeworks.course2.lesson1;

public class Car extends Bicycle implements Vehicle{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


}
