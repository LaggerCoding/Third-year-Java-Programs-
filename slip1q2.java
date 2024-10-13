abstract class staff{
    protected int id;
    protected String name;

    public staff(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void display(){
        System.out.print(id+"\t"+name+"\t");
    }
}
