// Formula for minimum heart rate in beats per minute is 220 minus your age years...heart range 50-85% of your maximum heart rate
class HeartRates{
    private 
    String fname;
    String lname;
    int day;
    int month;
    int year;
    HeartRates(String f,String l,int d,int m,int y){
        fname=f;
        lname=l;
        day=d;
        month=m;
        year=y;
    }
    public String getF(){
        return this.fname;
    }
    public String getL(){
        return this.lname;
    }
    public int getD(){
        return this.day;
    }
    public int getM(){
        return this.month;
    }
    public int getY(){
        return this.year;
    }
    public int age(){
        int i=2023-this.year;
        return i;
    }
    public int heartrate(){
        int i=220-age();
        return i;
    }   
    public static void main(String args[])
    {
        HeartRates H=new HeartRates("Israr","Qayyum",30,07,2004);
        System.out.println("--------Name--------\n\t"+H.getF()+" "+H.getL());
        System.out.println("--------Age--------\n\t"+H.age());
        System.out.println("--------Heart Rate--------\n\t"+H.heartrate());
    }
}