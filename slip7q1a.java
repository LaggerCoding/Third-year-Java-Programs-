import java.util.*;

class testbank{
    public static void main(String args[]){
        int n,i=0,no,choice,ac,cash;
        String name;
        float bal;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER BANK ID :");
        no = sc.nextInt();
        System.out.println("ENTER NAME :");
        name = sc.next();
        System.out.println("ENTER CURRENT BANK BALANCE :");
        bal = sc.nextFloat();
        bank b = new bank(no,name,bal);
       

        do{
            System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.DISPLAY AVAILABLE BALANCE\n4.EXIT");
            choice = sc.nextInt();

            switch(choice){
                case 1 : System.out.println("ENTER YOUR AMOUNT :");
                         cash = sc.nextInt();
                         b.deposit(cash);
                         break;
                case 2 : System.out.println("ENTER YOUR AMOUNT :");
                         cash = sc.nextInt();
                         b.withdraw(cash);
                         break;
                case 3 : b.display();
                         break;
            }
        }while(choice != 4);
    }
}