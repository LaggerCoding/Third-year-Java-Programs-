class officestaff extends staff{
    protected String dep;

    public officestaff(int id,String name,String dep)
    {
        super(id,name);
        this.dep = dep;
    }

    public void display(){
        super.display();
        System.out.println(dep);
    }
}