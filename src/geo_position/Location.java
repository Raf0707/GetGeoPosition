package geo_position;

public class Location {
    private String position;
    private String geoPosition;
    private String location;

    public Location(String position, String geoPosition, String location) {
        this.position = position;
        this.geoPosition = geoPosition;
        this.location = location;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGeoPosition() {
        return geoPosition;
    }

    public void setGeoPosition(String geoPosition) {
        this.geoPosition = geoPosition;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
