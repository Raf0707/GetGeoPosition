package geo_position;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GeoPosition  {

    public String vkPersonLink;

    public GeoPosition(String vkPersonLink) {
        this.vkPersonLink = vkPersonLink;
    }

    public String getVkPersonLink() {
        return vkPersonLink;
    }

    public void setVkPersonLink(String vkPersonLink) {
        this.vkPersonLink = vkPersonLink;
    }

    public static void main(String[] args) {
        System.out.println(getLocation("{.from}: vk.com"));
    }

    public static void getPosition(String vk_link) {
        System.out.println(getLocation("vk.com"));
    }


    public static String getLocation(String vk_link) {
        return "48.533" + Math.random();
    }

    public String getCurrentGeoPosition(String vkPersonLink) {
        Runnable helloRunnable = new Runnable() {
            public void run() {
                System.out.println("48.533" + Math.random());
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 3, TimeUnit.SECONDS);

        return "48.533" + Math.random();
    }

    /*
    @Override
    public void getCurrentGeoPosition(String vkPersonLink) {
        Runnable helloRunnable = new Runnable() {
            public void run() {
                System.out.println("48.533" + Math.random());
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 3, TimeUnit.SECONDS);

    }

    @Override
    public void getCurrentLocation() {
        System.out.println("48.533" + Math.random());
    }

    @Override
    public void getCurrentPosition() {
        System.out.println("48.533" + Math.random());
    }

     */
}
