public class Person {

    // Attributes that each person has
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String physicalAddress;

    // Constructor function. Used to create person objects in the Main.java file, e.g. an architect of the type Person
    public Person(String name, String phoneNumber, String emailAddress, String physicalAddress) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
        this.setPhysicalAddress(physicalAddress);
    }

    // Getters and setters used to define person attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }
}
