import java.util.*;

class matrix{
    public static void main(String args[]){
        int r1,r2,c1,c2,i,j,choice,k;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER INFORMATION OF MATRIX 1 :");
        System.out.println("ENTER HOW MANY ROWS :");
        r1 = sc.nextInt();
        System.out.println("ENTER HOW MANY COLUMNS :");
        c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++){
                System.out.println("ENTER NEXT ELEMENT :");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("ENTER INFORMATION OF MATRIX 2 :");
        System.out.println("ENTER HOW MANY ROWS :");
        r2 = sc.nextInt();
        System.out.println("ENTER HOW MANY COLUMNS :");
        c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++){
                System.out.println("ENTER NEXT ELEMENT :");
                b[i][j] = sc.nextInt();
            }
        }

        do{
            System.out.println("\n1.ADDITION\n2.MULTIPLICATION\n3.EXIT\nSELECT YOUR CHOICE :");
            choice = sc.nextInt();

            switch(choice){
                case 1: if(r1==r2 && c1==c2)
                        {
                            for(i=0;i<r2;i++)
                            {
                                System.out.println("");
                                for(j=0;j<c2;j++){
                                   System.out.print(a[i][j]+b[i][j]+"\t");
                                }
                            }
                        }
                        break;
                case 2 :if(c1==r2)
                        {
                            for(i=0;i<r2;i++)
                            {
                                System.out.println("");
                                for(j=0;j<c2;j++){
                                   System.out.print(a[i][j]*b[i][j]+"\t");
                                }
                            }
                        }
                        break;
            }
        }while(choice!=3);
    }
}