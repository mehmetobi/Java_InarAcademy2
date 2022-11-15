package Chapters.Chapter10.Exercises10_Soru01;

public class Time {
    private long hour ;
    private  long minute ;
    private long second ;
    private long time ;
    public Time (){
        time = System.currentTimeMillis();

    }
    public Time (long newTime){
    time= newTime ;
    }

    public Time ( long newHour, long newMinute, long newSecond){
        hour = newHour;
        minute= newMinute;
        second= newSecond;

    }

    public void setTime(long elapsedTime) {
        this.time = elapsedTime;
    }

    public long getHour() {
        return time/ (1000 * 60 * 60) % 24;
    }

    public long getMinute() {
        return time / (1000 * 60) % 60;
    }

    public long getSecond() {
        return time / 1000 % 60;
    }
}


