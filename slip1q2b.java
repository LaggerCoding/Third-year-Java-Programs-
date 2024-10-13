import java.util.*;

class teststaff{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n,i,id;
        String name,dep;

        System.out.println("ENTER HOW MANY STAFF MEMBERS :");
        n = sc.nextInt();
        officestaff of[] = new officestaff[n];

        for(i=0;i<n;i++)
        {
            System.out.println("ENTER STAFF ID :");
            id = sc.nextInt();
            System.out.println("ENTER STAFF NAME :");
            name = sc.next();
            System.out.println("ENTER STAFF DEPARTMENT :");
            dep = sc.next();

            of[i] = new officestaff(id,name,dep);
        }

        System.out.println("ID\tNAME\tDEPARTMENT");
        for(i=0;i<n;i++)
        {
            of[i].display();
        }
    }
}