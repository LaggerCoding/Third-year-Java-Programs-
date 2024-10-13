import java.util.*;

public class slip1q1{
    public static void main(String args[]){
        int n,i,j,flag=0,no;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER HOW MANY NUMBERS :");
        n = sc.nextInt();
        int a[] = new int[n];

        for(i=0;i<n;i++)
        {
            System.out.println("ENTER NEXT NUMBER :");
            a[i] = sc.nextInt();
        }

        for(i=0;i<n;i++)
        {
            j=1;
            no = a[i];
            flag=0;

            if(no!=1 && no!=2)
            {
                while(no>=j)
                {
                    if(a[i]%j==0)
                        flag++;
                    j++;
                }   
            }
    

            if(flag==2)
                System.out.println("PRIME NUMBER");
            else
                System.out.println("NOT PRIME NUMBER");
        }
    }
}