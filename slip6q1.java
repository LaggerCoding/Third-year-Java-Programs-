class employee{
    private int Empid;
    private String Empname,Empdesignation;
    private float Empsal;

    public employee(){
        Empid = 0;
        Empname = null;
        Empdesignation = null;
        Empsal = 0.0f;
    }

    public employee(int Empid,String Empname,String Empdesignation,float Empsal){
        this.Empid = Empid;
        this.Empname = Empname;
        this.Empdesignation = Empdesignation;
        this.Empsal = Empsal;
    }

    public void toString()
    {
        System.out.println(Empid+" "+Empname+" "+Empdesignation+" "+Empsal);
    }

    public static void main(String args[]){
        employee emp = new employee(1,"SKANDAJ","CEO",10000);

        emp.toString();
    }
}

