package Component2;

public class dasf {
    
}
import java.util.ArrayList;
import java.util.Scanner;

class Advertisement {
    static int latestId = 0;
    int advertisementId;
    String clientName;
    String startDate;

    Advertisement(String clientName, String startDate) {
        Advertisement.latestId++;
        this.advertisementId = Advertisement.latestId;
        this.clientName = clientName;
        this.startDate = startDate;
    }
}

class CommercialAdd extends Advertisement {
    int sizeOfAdd;
    double pricePerCm;

    CommercialAdd(String clientName, String startDate, int sizeOfAdd, double pricePerCm) {
        super(clientName, startDate);
        this.sizeOfAdd = sizeOfAdd;
        this.pricePerCm = pricePerCm;
    }

    double addCost() {
        return sizeOfAdd * pricePerCm;
    }
}

class FreeAdd extends Advertisement {
    int freeAddTimeDuration;

    FreeAdd(String clientName, String startDate, int freeAddTimeDuration) {
        super(clientName, startDate);
        this.freeAddTimeDuration = freeAddTimeDuration;
    }
}

public class AdvertisementProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Advertisement> advertisements = new ArrayList<>();

        // Read values for Commercial Add instances
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Commercial Add #" + (i + 1));
            System.out.print("Client Name: ");
            String clientName = scanner.nextLine();
            System.out.print("Start Date: ");
            String startDate = scanner.nextLine();
            System.out.print("Size of Add (in cm): ");
            int sizeOfAdd = scanner.nextInt();
            System.out.print("Price per cm: ");
            double pricePerCm = scanner.nextDouble();

            CommercialAdd commercialAdd = new CommercialAdd(clientName, startDate, sizeOfAdd, pricePerCm);
            advertisements.add(commercialAdd);
            scanner.nextLine(); // Consume the newline character
        }

        // Read values for Free Add instances
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Free Add #" + (i + 1));
            System.out.print("Client Name: ");
            String clientName = scanner.nextLine();
            System.out.print("Start Date: ");
            String startDate = scanner.nextLine();
            System.out.print("Free Add Time Duration (in months): ");
            int freeAddTimeDuration = scanner.nextInt();

            FreeAdd freeAdd = new FreeAdd(clientName, startDate, freeAddTimeDuration);
            advertisements.add(freeAdd);
            scanner.nextLine(); // Consume the newline character
        }

        // Display values of Commercial Add and Free Add instances
        System.out.println("\nDisplaying values of Commercial Add and Free Add instances:");
        for (Advertisement ad : advertisements) {
            if (ad instanceof CommercialAdd) {
                CommercialAdd commercialAdd = (CommercialAdd) ad;
                System.out.println("Commercial Ad - ID: " + commercialAdd.advertisementId +
                        ", Size of Add: " + commercialAdd.sizeOfAdd +
                        " cm, Price per cm: $" + commercialAdd.pricePerCm);
            } else if (ad instanceof FreeAdd) {
                FreeAdd freeAdd = (FreeAdd) ad;
                System.out.println("Free Ad - ID: " + freeAdd.advertisementId +
                        ", Free Time Duration: " + freeAdd.freeAddTimeDuration + " months");
            }
        }

        // Display add cost for a given advertisement id
        System.out.print("\nEnter Advertisement ID to display add cost for Commercial Add: ");
        int inputId = scanner.nextInt();
        for (Advertisement ad : advertisements) {
            if (ad instanceof CommercialAdd && ad.advertisementId == inputId) {
                CommercialAdd commercialAdd = (CommercialAdd) ad;
                System.out.println("Add Cost for Commercial Ad with ID " + commercialAdd.advertisementId +
                        ": $" + commercialAdd.addCost());
                break;
            }
        }

        // Display all free adds with a duration more than 3 months
        System.out.println("\nFree Adds with a duration more than 3 months:");
        for (Advertisement ad : advertisements) {
            if (ad instanceof FreeAdd && ((FreeAdd) ad).freeAddTimeDuration > 3) {
                FreeAdd freeAdd = (FreeAdd) ad;
                System.out.println("Free Ad - ID: " + freeAdd.advertisementId +
                        ", Free Time Duration: " + freeAdd.freeAddTimeDuration + " months");
            }
        }

        // Display total income from commercial add
        double totalIncome = 0;
        for (Advertisement ad : advertisements) {
            if (ad instanceof CommercialAdd) {
                CommercialAdd commercialAdd = (CommercialAdd) ad;
                totalIncome += commercialAdd.addCost();
            }
        }
        System.out.println("\nTotal Income from Commercial Adds: $" + totalIncome);
    }
}
