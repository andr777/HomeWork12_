package pro.sky.java.homeworks.course2.lesson1;

public interface Vehicle {

    default void updateTyre() {
    }

    default void checkEngine() {
    }

    default void checkTrailer() {
    }

    String getModelName();

    int getWheelsCount();

    default void setModelName(String modelName) {
    }

    default void setWheelsCount(int wheelsCount0) {
    }

}
