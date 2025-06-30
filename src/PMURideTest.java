import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PMURideTest {
    private static Student student1;
    private static Student student2;
    private static Location PMU;
    private static Location someLocation1;
    private static Location someLocation2;
    private static Car car;
    private static Driver driver;
    private static Passenger passenger;
    private static Ride ride;
    @BeforeAll
    public static void setUpAll(){
        student1 = new Student("Mohammed", "Alqadda", "202002837", "MFQ_305@hotmail.com", "+966541005774", "PMU!MFQ7");
        student2 = new Student("Ibrahim", "Aldossary", "201800259", "dossaryibrahim101@gmail.com", "+966500429898", "PMU!Ibra01");
        PMU = new Location("26.145582, 50.089928"); //pmu
        someLocation1 = new Location("26.202606, 50.205981");
        someLocation2 = new Location("26.273835, 50.194624");
        car = new Car("Silverado", "Gray", "2013",3);
        driver = new Driver(car, someLocation1, student1);
        passenger = new Passenger(someLocation2, PMU,student2);
        ride = new Ride(driver,passenger);
    }
    //Testing Calculating Distance between two locations
    @Test
    public void locationTestDistance(){
        // should be around 13 km
        assertEquals(13,Math.round(someLocation1.distanceDifference(PMU)));
    }
    //PR-10 change password
    @Test
    public void studentForgotPassword(){
        student1.setPassword("PMU!MFQ8");
        assertEquals("PMU!MFQ8", student1.getPassword());
    }
    //PR-10 log in after changing password
    @Test
    public void studentLogIn(){
        assertTrue(student1.login("202002837","PMU!MFQ8"));
    }
    //PR-6 estimated time
    @Test
    public void rideEstimatedTime(){
        assertEquals(12,ride.getEstimatedTime());
    }
    //PR-6 driver location
    @Test
    public void getDriverLocation(){
        assertEquals("26.202606, 50.205981", ride.getDriver().getLocation().getLocationString());
    }
    //PR-3 car details (color)
    @Test
    public void carDetailsColor(){
        car.setColor("Black");
        assertEquals("Black", car.getColor());
    }
    //PR-3 car details (model)
    @Test
    public void carDetailsModel(){
        car.setModel("Camry");
        assertEquals("Camry", car.getModel());
    }
     //PR-3 car details (year)
    @Test
    public void carDetailsYear(){
        car.setYear("2020");
        assertEquals("2020", car.getYear());
    }
    //PR-5 cost of a ride
    @Test
    public void howMuch(){
        assertEquals(45.35, ride.getCost(),0.01);
    }
     //PR-7 distance of ride
    @Test
    public void rideDistance(){
        assertEquals(17.67, ride.getDistance(),0.01);
    }
}
