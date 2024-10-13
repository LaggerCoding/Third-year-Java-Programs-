import java.util.*;

class testproduct{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i,id,quantity;
        String name;
        float cost;

        System.out.println("ENTER HOW MANY OBJECTS :");
        n = sc.nextInt();
        product p[] =  new product[n];

        for(i=0;i<n;i++)
        {
            System.out.println("ENTER PRODUCT ID :");
            id = sc.nextInt();
            System.out.println("ENTER PRODUCT NAME :");
            name = sc.next();
            System.out.println("ENTER PRODUCT QUANTITY :");
            quantity = sc.nextInt();
            System.out.println("ENTER PRODUCT COST :");
            cost = sc.nextFloat();

            p[i] = new product(id,name,quantity,cost);
        }

        System.out.println("ID\tNAME\tQUANTITY\tCOST");
        for(i=0;i<n;i++){
            p[i].display();
        }
    }
}