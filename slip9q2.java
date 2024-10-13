interface productinterface{}

class product implements productinterface{
    int product_id,product_quantity;
    String product_name;
    float product_cost;
    static int count;

    public product(){
        product_id=0;
        product_name=null;
        product_quantity=0;
        product_cost=0.0f;
    }

    public product(int product_id,String product_name,int product_quantity,float product_cost){
        this.product_id=product_id;
        this.product_name=product_name;
        this.product_quantity=product_quantity;
        this.product_cost=product_cost;
        count+=1;
    }

    public void display()
    {
        System.out.println(product_id+"\t"+product_name+"\t"+product_quantity+"\t\t"+product_cost);
    }
}