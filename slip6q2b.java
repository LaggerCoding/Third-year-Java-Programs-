class purchaseorder extends order{
    private String custombername;

    public void accept(int id,String description,String custombername){
        this.id = id;
        this.description = description;
        this.custombername = custombername;
    }

    public void display(){
        System.out.println(id+" "+description+" "+custombername);
    }
}