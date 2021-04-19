public class Doctor extends Person{

    int D_id=0;
    String D_name="";

    public Doctor(int pid, String p_name,int i,String n){
        super(pid,p_name);
         D_id=i;
         D_name=n;

    }
    public void show_doctor_details(){

        System.out.println("Doctor id is "+D_id);
        System.out.println("Doctor name is "+D_name);
    }
}
