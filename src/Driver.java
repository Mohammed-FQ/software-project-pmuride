public class Driver extends Student{
    Car car;
    Location location;

    public Driver(String fName, String lName, String id, String email, String phoneNum, String password, Car car, Location location) {
        super(fName, lName, id, email, phoneNum, password);
        this.car = car;
        this.location = location;
    }

    public Driver(Car car, Location location) {
        this.car = car;
        this.location = location;
    }
    public Driver(Car car, Location location, Student student) {
        super(student.getFirstName(), student.getLastName(), student.getId(), student.getEmail(),student.getPhoneNum(), student.getPassword());
        this.car = car;
        this.location = location;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
