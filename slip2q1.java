import java.util.*;

class bmi{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String fn=args[0],ln=args[1];
        float h=Float.parseFloat(args[3]),w=Float.parseFloat(args[2]),pbmi;

        System.out.println("FIRST NAME\tLAST NAME\tWEIGHT\tHEIGHT");
        System.out.println(fn+"\t"+ln+"\t\t"+w+"\t"+h);   

        pbmi = w/(h*h);

        System.out.println("BMI INDEX OF "+fn+" IS "+pbmi);
    }
}