package pro.sky.java.homeworks.course2.lesson1;

public class Bicycle implements Vehicle {

    private String modelName;
    private int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName0) {
        modelName = modelName0;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount0) {
        wheelsCount = wheelsCount0;
    }

}
