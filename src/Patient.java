public class Patient extends Doctor{

    int pat_id=0;
    String pat_name="";

    public Patient(int pid, String p_name,int i,String n,int pat_i,String pat_nam){
        super(pid,p_name,i,n);
        pat_id=pat_i;
        pat_name=pat_nam;

    }
    public void show_patient_details(){
        System.out.println("Patient id is "+pat_id);
        System.out.println("Patient name is "+pat_name);

    }
}
