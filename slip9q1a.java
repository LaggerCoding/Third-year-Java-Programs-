import java.util.*;

class error extends Exception{
    public String toString(){
        return "THIS TIME IS INVALID PLEASE TRY AGAIN.";
    }
}

class testclock{
    public static void main(String args[]){
        clock c;
        int hr,min,sec;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER HOURS :");
        hr = sc.nextInt();
        System.out.println("ENTER MINUTES :");
        min = sc.nextInt();
        System.out.println("ENTER SECONDS :");
        sec = sc.nextInt();

        if(hr>0 && hr<24 && min>0 && min<60 && sec>0 && sec<60)
        {
            c = new clock(hr,min,sec);
            c.display();
        }
        else
        {
            try{
                throw new error();
            }catch(error e)
            {
                System.out.println(e);
            }
        }
    }
}