package Objects_Basic;

public class Clock {

    protected int hours;
    protected int minutes;
    protected int seconds;

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

        checkSecAndMin();

        Clock subtrackedClock = new Clock(hour, min, sec);
        return  subtrackedClock;
    }

    private int checkSecAndMin(){
        if (seconds > 59) {
            minutes = seconds / 60;
            seconds = seconds - 60*minutes;
        }
        if (minutes>59){
            hours = minutes / 60;
            minutes = minutes - 60*hours;
        }
        return seconds;
    }

}
