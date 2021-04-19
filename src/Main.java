import java.util.Scanner;
public class Main {

    public static void main(String[]args){
        Scanner k = new Scanner(System.in);

        System.out.println("Enter Id");
        int person_id =k.nextInt();

        System.out.println("Enter Name ");
        String person_name=k.next();



        System.out.println("Enter Doctor Id");
        int doctor_id =k.nextInt();

        System.out.println("Enter Doctor Name ");
        String doctor_name=k.next();

        System.out.println("Enter Patient Id");
        int patient_id =k.nextInt();

        System.out.println("Enter Patient  Name ");
        String patient_name=k.next();

        Patient pat= new Patient(person_id,person_name,doctor_id,doctor_name,patient_id,patient_name);

        pat.show_doctor_details();
        pat.show_patient_details();



    }
}
