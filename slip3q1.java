import java.util.*;

class city{
    public static void main(String args[]){
        int n,i,ans,j;
        String name,temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER HOW MANY CITIES :");
        n = sc.nextInt();
        String city[] = new String[n];

        for(i=0;i<n;i++){
            System.out.println("ENTER NAME OF NEXT CITY :");
            city[i]  = sc.next(); 
        }

        System.out.println("BEFORE SORTING :");
        for(i=0;i<n;i++){
            System.out.println(city[i]);
        }

        for(i=1;i<n;i++){
            for(j=0;j<n-i;j++){
                ans = city[j].compareTo(city[j+1]);
                if(ans<0){
                  temp = city[j];
                  city[j] = city[j+1];
                  city[j+1] = temp; 
                }
            }
        }

        System.out.println("AFTER SORTING :");
        for(i=0;i<n;i++){
            System.out.println(city[i]);
        }
    }
}