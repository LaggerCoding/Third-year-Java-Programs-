class patient{
    String patient_name;
    int patient_age;
    float patient_oxy_level,patient_HRTC_report;

    public void accept(String patient_name,int patient_age,float patient_oxy_level,float patient_HRTC_report){
        this.patient_name=patient_name;
        this.patient_age=patient_age;
        this.patient_oxy_level=patient_oxy_level;
        this.patient_HRTC_report=patient_HRTC_report;
    }

    public void display()
    {
        System.out.println(patient_name+"\t"+patient_age+"\t"+patient_oxy_level+"\t"+patient_HRTC_report);
    }
}