class salesorder extends order{
    private String vendorname;

   public void accept(int id,String description,String vendorname){
        this.id = id;
        this.description = description;
        this.vendorname = vendorname;
    }

    public void display(){
        System.out.println(id+" "+description+" "+vendorname);
    }
}