package Component2;



class Advertisement {
    int advertisementId;
    String clientName;
    String startDate;

    Advertisement(int advertisementId, String clientName, String startDate) {
        this.advertisementId = advertisementId;
        this.clientName = clientName;
        this.startDate = startDate;
    }
}

class CommercialAdd extends Advertisement {
    int sizeOfAdd;
    double pricePerCm;

    CommercialAdd(int advertisementId, String clientName, String startDate, int sizeOfAdd, double pricePerCm) {
        super(advertisementId, clientName, startDate);
        this.sizeOfAdd = sizeOfAdd;
        this.pricePerCm = pricePerCm;
    }
    void displayCom(){
        System.out.println("Commercial Ad - ID: " + advertisementId +
                        ", Size of Add: " + sizeOfAdd +
                        " cm, Price per cm:" + pricePerCm);
    }
    double addCost() {

        return sizeOfAdd * pricePerCm;
    }
}

class FreeAdd extends Advertisement {
    int freeAddTimeDuration;

    FreeAdd(int advertisementId, String clientName, String startDate, int freeAddTimeDuration) {
        super(advertisementId, clientName, startDate);
        this.freeAddTimeDuration = freeAddTimeDuration;
        
    }
    void displayFree(){
        System.out.println("Free Ad - ID: " + advertisementId +
                        ", Free Time Duration: " +freeAddTimeDuration + " months");
    }
    double freeAddTime(){
        return freeAddTimeDuration;
    }
}

