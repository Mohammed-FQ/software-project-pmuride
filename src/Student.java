public class Student {
    private String fName;
    private String lName;
    private String id;
    private String email;
    private String phoneNum;
    private String password;

    public Student(String fName, String lName, String id, String email, String phoneNum, String password) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.email = email;
        this.phoneNum = phoneNum;
        this.password = password;
    }

    public Student() {
    }

    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean login(String id, String password) {
        return id.equals(getId()) && password.equals(getPassword());
    }
}