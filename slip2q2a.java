import java.util.*;

class testcricket{
    public static void main(String args[]){
        int n,innings,nout,totalruns,i;
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER HOW MANY PLAYERS TO ENTER :");
        n = sc.nextInt();
        cricketplayer c[] = new cricketplayer[n];

        for(i =0;i<n;i++){
            System.out.println("ENTER NAME OF PLAYER :");
            name = sc.next();
            System.out.println("ENTER TOTAL INNINGS:");
            innings = sc.nextInt();
            System.out.println("ENTER TIMES WHEN PLAYER WAS NOT OUT :");
            nout = sc.nextInt();
            System.out.println("ENTER TOTAL RUNS :");
            totalruns = sc.nextInt();

            c[i] = new cricketplayer(name,innings,nout,totalruns);
        }

        System.out.println("NAME\tINNINGS\tNOTOUT\tTOTALRUNS\tAVERAGE");
        for(i=0;i<n;i++){
            c[i].display();
        }
        cricketplayer temp = new cricketplayer();
        cricketplayer.sort(c,temp);

        System.out.println("AFTER SORTING");
        System.out.println("NAME\tINNINGS\tNOTOUT\tTOTALRUNS\tAVERAGE");
        for(i=0;i<n;i++){
            c[i].display();
        }

    }
}