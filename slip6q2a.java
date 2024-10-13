abstract class order{
    protected int id;
    protected String description;

    abstract public void accept(int id,String description,String custombername);

    abstract public void display();
}