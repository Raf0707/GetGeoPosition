package geo_position;

public class GeoData {
    private static GeoPosition geoPosition = new GeoPosition("https://vk.com/id783995104");

    static String local = geoPosition.getCurrentGeoPosition("https://vk.com/id783995104");

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(local);
    }

}
