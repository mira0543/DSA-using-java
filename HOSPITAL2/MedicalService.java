package HOSPITAL;

// parent abstract class
abstract class MedicalService {
    // declaring attributes
    private String serviceId;
    private String serviceName;
    private double baseCost;

    // creating constructor
    public MedicalService(String serviceId, String serviceName, double baseCost) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.baseCost = baseCost;
    }

    // creating getter and setter methods
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    // abstract method
    public abstract double calculateTotalCost();

    // displaying method
    public void display() {
        System.out.println("Service ID : " + getServiceId());
        System.out.println("Service : " + getServiceName());
        System.out.printf("Total Cost : $%.2f%n", calculateTotalCost());
    }
}

// child class 1
class Consultation extends MedicalService {
    // declaring attribute
    private double doctorFee;

    // constructor
    public Consultation(String serviceId, String serviceName, double baseCost, double doctorFee) {
        super(serviceId, serviceName, baseCost);
        this.doctorFee = doctorFee;
    }

    // getter and setter methods
    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    // overriding calculate method
    @Override
    public double calculateTotalCost() {
        return getBaseCost() + getDoctorFee();
    }

    // overriding display method
    @Override
    public void display() {
        super.display();
    }
}

// child class 2
class LaboratoryTest extends MedicalService {
    // declaring attribute
    private double testCharge;

    // constructor
    public LaboratoryTest(String serviceId, String serviceName, double baseCost, double testCharge) {
        super(serviceId, serviceName, baseCost);
        this.testCharge = testCharge;
    }

    // getter and setter methods
    public double getTestCharge() {
        return testCharge;
    }

    public void setTestCharge(double testCharge) {
        this.testCharge = testCharge;
    }

    // overriding calculate method
    @Override
    public double calculateTotalCost() {
        return getBaseCost() + getTestCharge();
    }

    // overriding display method
    @Override
    public void display() {
        super.display();
    }
}

// child class 3
class Ultrasound extends MedicalService {
    // declaring attribute
    private double additionalFee;

    // constructor
    public Ultrasound(String serviceId, String serviceName, double baseCost, double additionalFee) {
        super(serviceId, serviceName, baseCost);
        this.additionalFee = additionalFee;
    }

    // getter and setter methods
    public double getAdditionalFee() {
        return additionalFee;
    }

    public void setAdditionalFee(double additionalFee) {
        this.additionalFee = additionalFee;
    }

    // overriding calculate method
    @Override
    public double calculateTotalCost() {
        return getBaseCost() + getAdditionalFee();
    }

    // overriding display method
    @Override
    public void display() {
        super.display();
    }
}

// main class
class Main {
    public static void main(String[] args) {

        MedicalService[] services = {
                new Consultation("S001", "Consultation", 20, 25),
                new LaboratoryTest("S002", "Laboratory Test", 10, 7),
                new Ultrasound("S003", "Ultrasound", 35, 25)
        };

        double totalBill = 0;

        System.out.println("===== HOSPITAL BILLING SYSTEM =====");
        System.out.println();

        for (int i = 0; i < services.length; i++) {
            services[i].display();
            totalBill = totalBill + services[i].calculateTotalCost();
            System.out.println();
        }



        System.out.println("------------------------------");
        System.out.printf("Total Hospital Bill: $%.2f%n", totalBill);
    }
}

