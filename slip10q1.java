@FunctionalInterface
interface A{
    void cube(int x);
}

class test{
    public static void main(String args[]){
        A ob = (x) -> {System.out.println(x*x*x);};
        ob.cube(5);
    }
}