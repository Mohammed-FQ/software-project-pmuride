public class Ride {
    private Driver driver;
    private Passenger passenger;
    private float distance;
    private float cost;
    private int estimatedTime;

    public Ride(Driver driver, Passenger passenger) {
        this.driver = driver;
        this.passenger = passenger;
        this.distance = passenger.getLocation().distanceDifference(passenger.getDestination());
        this.cost = 10 + distance * 2;
        float driverPassengerDis = passenger.getLocation().distanceDifference(driver.getLocation());
        this.estimatedTime = (int) Math.round(driverPassengerDis * 1.5);
    }


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = passenger.getLocation().distanceDifference(passenger.getDestination());
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = 10 + distance * 2;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        float driverPassengerDis = passenger.getLocation().distanceDifference(driver.getLocation());
    }    
}
    
