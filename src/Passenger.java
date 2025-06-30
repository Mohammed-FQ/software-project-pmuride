public class Passenger extends Student{
    private Location location;
    private Location destination;

    public Passenger(String fName, String lName, String id, String email, String phoneNum, String password, Location location, Location destination) {
        super(fName, lName, id, email, phoneNum, password);
        this.location = location;
        this.destination = destination;
    }

    public Passenger(Location location, Location destination) {
        this.location = location;
        this.destination = destination;

    }
    public Passenger(Location location, Location destination, Student student) {
        super(student.getFirstName(), student.getLastName(), student.getId(), student.getEmail(),student.getPhoneNum(), student.getPassword());
        this.location = location;
        this.destination = destination;

    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }
}
