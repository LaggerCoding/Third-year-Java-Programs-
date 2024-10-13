class cricketplayer{
    String name;
    int innings,nout,totalruns;
    static float bat_avg;
    static int cnt=0;

    public cricketplayer()
    {
        this.name=null;
        this.innings=0;
        this.nout=0;
        this.totalruns=0;
        this.bat_avg=0.0f;
    }
    public cricketplayer(String name,int innings,int nout,int totalruns){
        this.name = name;
        this.innings = innings;
        this.nout = nout;
        this.totalruns = totalruns;
        this.bat_avg = average(totalruns,innings,nout);
        cnt+=1;
    }

    public void display()
    {
        System.out.println(name+"\t"+innings+"\t"+nout+"\t"+totalruns+"\t\t"+bat_avg);
    }

    public static float average(int totalruns,int innings,int nout){
        return (totalruns/(innings - nout));
    }

    public static void sort(cricketplayer c[],cricketplayer temp){
        int i,j;

        for(i=1;i<cnt;i++){
            for(j=0;j<cnt-i;j++){
                if(c[j].bat_avg > c[j+1].bat_avg){
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
    }
}