package Chapters.Chapter09.Exercises09.Exercises09_Soru06;

import static java.lang.System.currentTimeMillis;


public class StopWatch {

     private long startTime ;
     private long endTime;

     public long getStartTime(){
         return startTime;
     }
    public long getEndTime() {
         return endTime;
    }

    public StopWatch() {
         this.startTime = currentTimeMillis();
    }

    public long start(){
      this.startTime= currentTimeMillis();
         return startTime;
    }
    public long stop(){
        this.endTime= currentTimeMillis();
        return endTime;
    }
    public long getElapsedTime(){
         return ( this.endTime - this.startTime ) ;
    }
}









