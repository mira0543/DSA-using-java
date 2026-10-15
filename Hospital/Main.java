package Hospital;

public class Main {
    static void main() {
        Patient p1 = new InPatient("Ali",5,30,6);
        Patient p2 = new InPatient("Maryam",15,50,4);
        Patient p3 = new OutPatient("Caisha",6,38);
        Patient p4 = new OutPatient("Mohamed",7,70);
        System.out.println("---Inpatient Information---");
        System.out.println( );
        p1.displayInfo();
        System.out.println( );
        p2.displayInfo();
        System.out.println( );
        System.out.println("---Outpatient Information---");
        System.out.println( );
        p3.displayInfo();
        System.out.println( );
        p4.displayInfo();

    }
}
