import java.util.*;

class test{
    public static void main(String args[]){
        int n,i=0,choice,id;
        String name,desc;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER HOW MANY ORDERS :");
        n = sc.nextInt();
        order o[] = new order[n];

        do{
            System.out.println("\n1.PURCHASE ORDER\n2.SALES ORDER\nSELECT YOUR CHOICE :");
            choice = sc.nextInt();

            switch(choice){
                case 1 :System.out.println("ENTER ID :");
                        id = sc.nextInt();
                        System.out.println("ENTER NAME :");
                        name = sc.next();
                        System.out.println("ENTER DESCRPTION :");
                        desc = sc.next();

                        o[i] = new purchaseorder();
                        o[i].accept(id,name,desc);
                        i++;
                        break;
                case 2 :System.out.println("ENTER ID :");
                        id = sc.nextInt();
                        System.out.println("ENTER NAME :");
                        name = sc.next();
                        System.out.println("ENTER DESCRPTION :");
                        desc = sc.next();

                        o[i] = new salesorder();
                        o[i].accept(id,name,desc);
                        i++;
                        break;
            }
        }while(i<n);

        for(i=0;i<n;i++){
            o[i].display();
        }
    }
}