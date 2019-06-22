package Objects_Basic;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

public class Clock {

    private int hours;
    private int minutes;
    private int seconds;
    public static final int MIN_IN_HOUR = 60;
    public static final int SEC_IN_HOUR = 60;
    public static final int HOURS_IN_DAY = 24;


    protected Clock(){
        this.hours = 12;
        this.minutes = 00;
        this.seconds = 00;
    }
    protected Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    protected Clock(int seconds){
        this.seconds = seconds;
        checkSecAndMin();

    }
    protected void setClock(int seconds){
        this.seconds = seconds;
        checkSecAndMin();
    }

    protected void tick(){
        seconds++;
        checkSecAndMin();
    }

    protected void addClock(Clock clock){
        this.seconds = seconds + clock.seconds;
        this.minutes = minutes +clock.minutes;
        this.hours = hours + clock.hours;

        checkSecAndMin();
    }

    protected String returnHHMMSS(Clock clock){
        int seconds = this.seconds;
        int minutes = this.minutes;
        int hour = this.hours;

        String HHMMSS = "";
        HHMMSS = "" + hour;
        if (minutes < 10) HHMMSS = HHMMSS +  ":0" + minutes;
            else HHMMSS = HHMMSS + ":" + minutes;
        if (seconds< 10) HHMMSS = HHMMSS + ":0" + seconds;
        else HHMMSS = HHMMSS + ":" + seconds;


        return HHMMSS;
    }

    protected void tickDown(){
        seconds--;
    }

    protected Clock substracktClock(Clock clock){

        this.seconds = seconds + minutes*60 + hours*60;
        minutes = 0; hours = 0;

        clock.seconds = clock.seconds + clock.minutes*60 + clock.hours*60;
        clock.minutes = 0; clock.hours = 0;



        int sec = (this.seconds>clock.seconds) ? this.seconds - clock.seconds : clock.seconds - this.seconds;
        int min=0;
        int hour=0;
        System.out.println(sec);
        if (sec > SEC_IN_HOUR - 1) {
            min = sec / SEC_IN_HOUR;
            sec = sec - SEC_IN_HOUR*min;
        }
        if (min>MIN_IN_HOUR - 1){
            hour = min / MIN_IN_HOUR;
            min = min - MIN_IN_HOUR*hour;
        }
        if (hour > HOURS_IN_DAY){
            hour = hour - HOURS_IN_DAY;
        }



        Clock subtrackedClock = new Clock(hour, min, sec);
        return  subtrackedClock;
    }

    private int checkSecAndMin(){
        if (seconds > SEC_IN_HOUR - 1) {
            minutes = seconds / SEC_IN_HOUR;
            seconds = seconds - SEC_IN_HOUR*minutes;
        }
        if (minutes > MIN_IN_HOUR - 1){
            hours = minutes / MIN_IN_HOUR;
            minutes = minutes - MIN_IN_HOUR*hours;
        }
        if (hours > HOURS_IN_DAY - 1) { //miss day
            hours = hours - HOURS_IN_DAY;
        }
        return seconds;
    }

}
