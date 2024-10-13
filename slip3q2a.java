import java.util.*;

class handle extends Exception{
    public String toString(){
        return "PATIENT IS COVID POSITIVE AND NEEDS TO BE HOSPITALIZED";
    }
}
class testpatient{
    public static void main(String args[]){
        patient p = new patient();
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        float oxy_level=0.0f,report=0.0f;

        try{
        System.out.println("ENTER PATIENT NAME :");
        name= sc.next();
        System.out.println("ENTER PATIENT AGE :");
        age = sc.nextInt();
        System.out.println("ENTER PATIENT OXYGEN LEVEL :");
        oxy_level = sc.nextFloat();
        System.out.println("ENTER HRTC REPORT DETAILS :");
        report = sc.nextFloat();

        p.accept(name,age,oxy_level,report);

        }catch(InputMismatchException ime){
            System.out.println("PLEASE ENTER PROPER INPUT ACCORDING TO REGULAR FORMAT\nime\n");
        }catch(Exception exp){
            System.out.println(exp);
        }

        if(oxy_level>95 && report>10){
            p.display();
        }
        else{
            try{
                throw new handle();
            }
            catch(handle h){
                System.out.println(h);
            }
        }
    }
}