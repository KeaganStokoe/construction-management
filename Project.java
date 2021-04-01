public class Project {

    // Attributes of every project
    int number;
    String name;
    String buildingType;
    String address;
    int erfNumber;
    float totalFee;
    float totalPaid;
    String deadlineDate;
    Person architect;
    Person contractor;
    Person customer;

    // Constructor function used to create a project instance in the Main.java file
    public Project(int number, String name, String buildingType, String address, int erfNumber, float totalFee,
            float totalPaid, String deadlineDate, Person architect, Person contractor, Person customer) {

        this.setNumber(number);
        this.setName(name);
        this.setBuildingType(buildingType);
        this.setAddress(address);
        this.setErfNumber(erfNumber);
        this.setTotalFee(totalFee);
        this.setTotalPaid(totalPaid);
        this.setDeadlineDate(deadlineDate);
        this.setArchitect(architect);
        this.setContractor(contractor);
        this.setCustomer(customer);

    }

    // Getters and setters used to define project properties
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getErfNumber() {
        return erfNumber;
    }

    public void setErfNumber(int erfNumber) {
        this.erfNumber = erfNumber;
    }

    public float getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(float totalFee) {
        this.totalFee = totalFee;
    }

    public float getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(float totalPaid) {
        this.totalPaid = totalPaid;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public Person getArchitect() {
        return architect;
    }

    public void setArchitect(Person architect) {
        this.architect = architect;
    }

    public Person contractor() {
        return contractor;
    }

    public void setContractor(Person contractor) {
        this.contractor = contractor;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    // Print summary description of the project using the getters and setters
    // defined above.
    // Display in an easy to read format.
    public void description() {
        System.out.println("=======================================");
        System.out.println("Project details:");
        System.out.println("\n");
        System.out.println("Project number: " + getNumber());
        System.out.println("Project name: " + getName());
        System.out.println("Building type: " + getBuildingType());
        System.out.println("Building address: " + getAddress());
        System.out.println("ERF number: " + getErfNumber());
        System.out.println("Total fee: " + getTotalFee());
        System.out.println("Total paid: " + getTotalPaid());
        System.out.println("Deadline: " + getDeadlineDate());
        System.out.println("=======================================");
        System.out.println("Architect details: ");
        System.out.println("\n");
        personDetails(architect);
        System.out.println("=======================================");
        System.out.println("Contractor details: ");
        System.out.println("\n");
        personDetails(contractor);
        System.out.println("=======================================");
        System.out.println("Customer details: ");
        System.out.println("\n");
        personDetails(customer);
        System.out.println("=======================================");

    }

    // Print a summary of a Person, based on the person passed as an argument.
    public void personDetails(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Phone number: " + person.getPhoneNumber());
        System.out.println("Email address: " + person.getEmailAddress());
        System.out.println("Physical address: " + person.getPhysicalAddress());
    }

    // Generate an invoice that displays customer details and calculate amount
    // outstanding.
    public void generateInvoice(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Phone number: " + person.getPhoneNumber());
        System.out.println("Email address: " + person.getEmailAddress());
        System.out.println("Physical address: " + person.getPhysicalAddress());
        System.out.println("Total outstanding: " + (getTotalFee() - getTotalPaid()));
    }

    @Override
    public String toString() {
        return "Project [address=" + address + ", architect=" + architect + ", buildingType=" + buildingType
                + ", contractor=" + contractor + ", customer=" + customer + ", deadlineDate=" + deadlineDate
                + ", erfNumber=" + erfNumber + ", name=" + name + ", number=" + number + ", totalFee=" + totalFee
                + ", totalPaid=" + totalPaid + "]";
    }

}
