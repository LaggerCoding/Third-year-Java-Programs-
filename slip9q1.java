class clock{
    int hr,min,sec;

    public clock(int hr,int min,int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void display(){
        if(hr>12)
        {
            System.out.println(hr+"\t"+min+"\t"+sec+"PM");
        }
        else
        {
            System.out.println(hr+"\t"+min+"\t"+sec+" AM");
        }
    }
}