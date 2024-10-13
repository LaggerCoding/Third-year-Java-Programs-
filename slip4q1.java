import java.util.*;

class testmatrix{
    public static void main(String args[]){
        int a[][] = new int[10][10];
        int r,c,i,j;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER HOW MANY ROWS :");
        r = sc.nextInt();
        System.out.println("ENTER HOW MANY COLUMNS :");
        c = sc.nextInt();

        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.println("ENTER NEXT ELEMENT :");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("BEFORE CHANGING ROWS AND COLUMNS :");
        for(i=0;i<r;i++){
            System.out.println("");
            for(j=0;j<c;j++){
                System.out.print("\t"+a[i][j]);
            }
        }

        System.out.println("\nAFTER CHANGING ROWS AND COLUMNS :");
        for(i=0;i<c;i++){
            System.out.println("");
            for(j=0;j<r;j++){
                System.out.print("\t"+a[j][i]);
            }
        }
    }
}