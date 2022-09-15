package pro.sky.java.homeworks.course2.lesson1;

public interface vehicle {

     default void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}
