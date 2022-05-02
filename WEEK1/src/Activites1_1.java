public class Activites1_1 {
    public static void main(String[] args) {
        Time time1=new Time(555550000);
        System.out.printf("%d:%d:%d",    time1.getHourTime(), time1.getMinuteTime(), time1.getSecondTime());

        Time time =new Time();
        //System.out.println(time.getHourTime());
        //System.out.println(System.currentTimeMillis());
        System.out.printf("%d:%d:%d%n",  time.getHourTime(),time.getMinuteTime(), time.getSecondTime());

        time.setTime(3538122567L);

        System.out.printf("%d:%d:%d%n",  time.getHourTime(), time.getMinuteTime(), time.getSecondTime());
    }
}
class Time {
    private long time;
    private int secondTime;
    private int minuteTime;
    private int hourTime;
    public Time(){
        this.time=System.currentTimeMillis();
    }
    public Time(long miliTime){
        this.time=miliTime;
    }
    public void setTime(long elapseTime){
        this.time = elapseTime;
    }
    public int getSecondTime(){
        secondTime=(int) (time/1000)%60;
        return secondTime;
    }
    public int getMinuteTime(){
        minuteTime=(int) (time/(1000*60))%60;
        return minuteTime;
    }
    public int getHourTime(){
        hourTime=(int) (time/(1000*60*60))%24;
        return hourTime;
    }

}
