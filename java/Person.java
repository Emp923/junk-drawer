public class Person {

    private String firstName;
    private String lastName;
    private String loc;
    private boolean happy;

    public Person(String firstName, String lastName, boolean happy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.loc = " N / A";
        this.happy = happy;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLocation() {
        return this.loc;
    }

    public void setLocation(String location) {
        this.loc = location;
    }

    public boolean isHappy() {
        return happy;
    }
}