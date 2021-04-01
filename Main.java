
// Import required libraries.
import java.util.*;

public class Main {

    // Instantiate variables used later in the program.
    int action;
    float updateFeesPaid;
    String updatePhoneNumber;
    String updateEmailAddress;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Open scanner

        // Request project details
        System.out.print("Project number: ");
        int projectNumber = sc.nextInt();
        sc.nextLine(); // Consume newline left-over. Without this, the script jumps to the following
                       // input, i.e. skips project name in this context.
        System.out.print("Project name: ");
        String projectName = sc.nextLine();
        System.out.print("Building type: ");
        String buildingType = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("ERF: ");
        int erfNumber = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.print("Total fee: ");
        float totalFee = sc.nextFloat();
        System.out.print("Total paid: ");
        float totalPaid = sc.nextFloat();
        sc.nextLine(); // Consume newline left-over
        System.out.print("Deadline (dd/mm/yyyy): ");
        String deadlineDate = sc.nextLine();

        // Request architect details
        System.out.print("Architect name: ");
        String architectName = sc.nextLine();
        System.out.print("Architect phone number: ");
        String architectPhone = sc.nextLine();
        System.out.print("Architect email address: ");
        String architectEmail = sc.nextLine();
        System.out.print("Architect physical address: ");
        String architectAddress = sc.nextLine();
        Person architect = new Person(architectName, architectPhone, architectEmail, architectAddress);

        // Request contractor details
        System.out.print("Contractor name: ");
        String contractorName = sc.nextLine();
        System.out.print("Contractor phone number: ");
        String contractorPhone = sc.nextLine();
        System.out.print("Contractor email address: ");
        String contractorEmail = sc.nextLine();
        System.out.print("Contractor physical address: ");
        String contractorAddress = sc.nextLine();
        Person contractor = new Person(contractorName, contractorPhone, contractorEmail, contractorAddress);

        // Request customer details
        System.out.print("Customer name: ");
        String customerName = sc.nextLine();
        System.out.print("Customer phone number: ");
        String customerPhone = sc.nextLine();
        System.out.print("Customer email address: ");
        String customerEmail = sc.nextLine();
        System.out.print("Customer physical address: ");
        String customerAddress = sc.nextLine();
        Person customer = new Person(customerName, customerPhone, customerEmail, customerAddress);

        // Create a new project using the Project constructor and passing in the
        // variables based on information requested above.
        Project p1 = new Project(projectNumber, projectName, buildingType, address, erfNumber, totalFee, totalPaid,
                deadlineDate, architect, contractor, customer);
        p1.description(); // Print project summary using description method defined in Project.java

        // Provide user with options for the actions they can take.
        System.out.print("Enter a number to complete an action: " + "\n");
        System.out.println("\n");
        System.out.print("1. Change project deadline: " + "\n");
        System.out.print("2. Change fees paid: " + "\n");
        System.out.print("3. Update contractor details: " + "\n");
        System.out.print("4. Finalise project: " + "\n");
        int action = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        if (action == 1) { // Update deadline.
            System.out.print("Please enter new deadline (dd/mm/yyyy): ");
            String newDeadline = sc.nextLine();
            p1.setDeadlineDate(newDeadline);
            System.out.print("Deadline successfully updated.");
        } else if (action == 2) { // Update total fees paid.
            System.out.print("Please enter total fees paid to date: ");
            float updateFeesPaid = sc.nextFloat();
            p1.setTotalPaid(updateFeesPaid);
            System.out.print("Total fees successfully updated.");
        } else if (action == 3) { // Update contractor details
            System.out.print("Contractor email address: ");
            String updateEmailAddress = sc.nextLine();
            System.out.print("Contractor physical address: ");
            String updatePhoneNumber = sc.nextLine();
            p1.contractor.setEmailAddress(updateEmailAddress);
            p1.contractor.setPhoneNumber(updatePhoneNumber);
            System.out.println("Updated email address: " + p1.contractor.getEmailAddress());
            System.out.println("Updated phone number: " + p1.contractor.getEmailAddress());
        } else if (action == 4) { // Publish an invoice using the method defined in the project.java file
            p1.generateInvoice(customer);
        } else {
            System.out.print("Invalid selection.");
        }

        sc.close(); // Close scanner

    }

}
