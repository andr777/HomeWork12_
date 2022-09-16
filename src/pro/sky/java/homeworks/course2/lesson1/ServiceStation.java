package pro.sky.java.homeworks.course2.lesson1;

public class ServiceStation {

    public void check0(Vehicle device) {
        if (device != null) {
            System.out.println("Обслуживаем " + device.getModelName());
            for (int i = 0; i < device.getWheelsCount(); i++) {
                device.updateTyre();
            }
            device.checkEngine();
            device.checkTrailer();
        }

    }

}
