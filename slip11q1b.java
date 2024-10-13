class cylinder implements operation{
    public static final double PI = 3.142;
    protected float r,h;

    public void volume(float r,float h){
        System.out.println("VOLUME OF CYLINDER IS "+(PI*r*r*h));
    }

    public void display(){
        System.out.println("HELLO");
    }
}