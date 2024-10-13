import java.util.*;

class continent{
    private String name;

    public continent(String name){
        this.name = name;
    }

    public void display(){
        System.out.print(name+"\t");
    }
}

class country extends continent{
    private String name;

    public country(String cname,String conname){
        super(conname);
        this.name = cname;
    }

    public void display(){
        super.display();
        System.out.print(name+"\t");
    }
}

class state extends country{
    private String name;

    public state(String sname,String cname,String conname){
        super(cname,conname);
        this.name = sname;
    }

    public void display(){
        super.display();
        System.out.print(name+"\t");
    }
}

class place extends state{
    private String name;

    public place(String pname,String sname,String cname,String conname){
        super(sname,cname,conname);
        this.name = pname;
    }

    public void display(){
        super.display();
        System.out.println(name+"\t");
    }
}

class testplace{
    public static void main(String args[]){
        String pl,s,c,con;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER PLACE NAME :");
        pl = sc.next();
        System.out.println("ENTER STATE NAME :");
        s = sc.next();
        System.out.println("ENTER COUNTRY NAME :");
        c = sc.next();
        System.out.println("ENTER CONTINENT NAME :");
        con = sc.next();

        place p = new place(pl,s,c,con);
        p.display();
    }
}