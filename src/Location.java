public class Location {
    private String locationString;
    private float latitude;
    private float longitude;

    public Location(String locationString) {
        this.locationString = locationString;
        String[] loc = locationString.split(",");
        this.latitude = Float.parseFloat(loc[0]);
        this.longitude = Float.parseFloat(loc[1]);
    }

    public String getLocationString() {
        return locationString;
    }

    public void setLocationString(String locationString) {
        this.locationString = locationString;
        String[] loc = locationString.split(",");
        this.latitude = Float.parseFloat(loc[0]);
        this.longitude = Float.parseFloat(loc[1]);
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
    public float distanceDifference(Location otherLocation) {
        // Haversine formula for calculating distance between two points on the Earth

        // Radius of the Earth in kilometers
        final double R = 6371.0;

        // Convert latitude and longitude from degrees to radians
        double lat1 = Math.toRadians(this.latitude);
        double lon1 = Math.toRadians(this.longitude);
        double lat2 = Math.toRadians(otherLocation.getLatitude());
        double lon2 = Math.toRadians(otherLocation.getLongitude());

        // Calculate the differences
        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        // Haversine formula
        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dLon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calculate the distance in kilometers
        double distance = R * c;

        return (float) distance;
    }
}
