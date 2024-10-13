class bank{
    private int acc_no;
    private String name;
    private float bal;

    public bank(){
        acc_no = -1;
        name = null;
        bal = 0.0f;
    }

    public bank(int acc_no,String name,float bal){
        this.acc_no = acc_no;
        this.name = name;
        this.bal = bal;
    }

    public void deposit(float x){
        bal = bal + x;
    }

    public void withdraw(float x){
        bal = bal - x;
    }

    public void display(){
        System.out.println(acc_no+" "+name+" "+bal+"\n");
    }
}