package Component2;
import java.util.Scanner;

import ClassWork.MyClass;

public class AdvertisementProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter details for Commercial Add 1 :");
            System.out.println("Client Name: ");
            String clientName1 = scanner.nextLine();
            System.out.print("Start Date: ");
            String startDate1 = scanner.nextLine();
            System.out.print("Size of Add: ");
            int sizeOfAdd1 = scanner.nextInt();
            System.out.print("Price per cm: ");
            double pricePerCm1 = scanner.nextDouble();
            scanner.nextLine();
        
        CommercialAdd commercialAdd1 = new CommercialAdd(1,clientName1, startDate1, sizeOfAdd1,pricePerCm1);

            System.out.println("Enter details for Commercial Add 2 :");
            System.out.println("Client Name: ");
            String clientName2 = scanner.nextLine();
            System.out.print("Start Date: ");
            String startDate2 = scanner.nextLine();
            System.out.print("Size of Add: ");
            int sizeOfAdd2 = scanner.nextInt();
            System.out.print("Price per cm: ");
            double pricePerCm2 = scanner.nextDouble();
            scanner.nextLine();
        
        CommercialAdd commercialAdd2 = new CommercialAdd(2,clientName2, startDate2, sizeOfAdd2,pricePerCm2);

         System.out.println("Enter details for Commercial Add 3:");
            System.out.println("Client Name: ");
            String clientName3 = scanner.nextLine();
            System.out.print("Start Date: ");
            String startDate3 = scanner.nextLine();
            System.out.print("Size of Add: ");
            int sizeOfAdd3 = scanner.nextInt();
            System.out.print("Price per cm: ");
            double pricePerCm3 = scanner.nextDouble();
            scanner.nextLine();
        CommercialAdd commercialAdd3 = new CommercialAdd(3,clientName3, startDate3, sizeOfAdd3,pricePerCm3);
       
        System.out.println("Enter details for Free Add 4:");
        System.out.print("Client Name: ");
        String clientName4 = scanner.nextLine();
        System.out.print("Start Date: ");
        String startDate4 = scanner.nextLine();
        System.out.print("Free Add Time Duration (in months): ");
        int freeAddTimeDuration4 = scanner.nextInt();
        scanner.nextLine();

        FreeAdd freeAdd1 = new FreeAdd(4,clientName4, startDate4, freeAddTimeDuration4);

        System.out.println("Enter details for Free Add 5:");
        System.out.print("Client Name: ");
        String clientName5 = scanner.nextLine();
        System.out.print("Start Date: ");
        String startDate5 = scanner.nextLine();
        System.out.print("Free Add Time Duration (in months): ");
        int freeAddTimeDuration5 = scanner.nextInt();
        scanner.nextLine();
        FreeAdd freeAdd2 = new FreeAdd(5, clientName5, startDate5, freeAddTimeDuration5);

        System.out.println("Enter details for Free Add 6:");
        System.out.print("Client Name: ");
        String clientName6 = scanner.nextLine();
        System.out.print("Start Date: ");
        String startDate6 = scanner.nextLine();
        System.out.print("Free Add Time Duration (in months): ");
        int freeAddTimeDuration6 = scanner.nextInt();
        scanner.nextLine();
        FreeAdd freeAdd3 = new FreeAdd(6,  clientName6, startDate6, freeAddTimeDuration6);

        commercialAdd1.displayCom();
        System.out.println("CommercialAdd1 cost is:"+commercialAdd1.addCost());
        commercialAdd2.displayCom();
        System.out.println("commercialAdd2 cost is:"+commercialAdd2.addCost());
        commercialAdd3.displayCom();
        System.out.println("commercialAdd3 cost is:"+commercialAdd3.addCost());

        freeAdd1.displayFree();
        System.out.println("freeAdd1 Time is:"+freeAdd1.freeAddTime());

        freeAdd2.displayFree();
        System.out.println("freeAdd2 Time  is:"+freeAdd2.freeAddTime());

        freeAdd2.displayFree();
        System.out.println("freeAdd3 Time is:"+freeAdd3.freeAddTime());


        //  AdvertisementProgram[] adv = new AdvertisementProgram[6];

        // adv[0] = new CommercialAdd(commercialAdd1);
        // adv[1]
        // adv[2]
        // adv[3]
        // adv[4]
        // adv[5]

        double totalIncome = commercialAdd1.addCost()+commercialAdd2.addCost()+commercialAdd3.addCost();
        

        System.out.println("\nTotal Income from Commercial Adds:" + totalIncome);

    }
}

