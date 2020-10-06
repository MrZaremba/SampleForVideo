public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        if (hour <= 23 && minute <= 59 && second <= 59){
            this.second = second;
            this.minute = minute;
            this.hour = hour;
        }
        if (hour <= 23 && minute <= 59 && second > 59){
            this.second = 0;
            this.minute = minute + 1;
            this.hour = hour;
        }
        if (hour <= 23 && second <= 59 && minute > 59 || this.minute > 59 ){
            this.minute = 0;
            this.hour = hour + 1;
        }
        if (hour > 23 && minute <= 59 && second <= 59){
            this.hour = 0;
            this.minute = minute;
            this.second = second;
        }
        if ((hour >= 23 || this.hour >= 23) && (minute < 59 || this.minute < 59) && second > 59){
            this.hour = 0;
            this.minute = minute + 1;
            this.second = 0;
        }
        if ((hour >= 23 || this.hour >= 23) && (minute >= 59 || this.minute >= 59) && second > 59 ){
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
        if ((hour >= 23 || this.hour >= 23) && minute > 59 && second <= 59 ){
            this.hour = 1;
            this.minute = 0;
            this.second = second;
        }
        if (this.hour == 0 && this.minute == 0 && this.second < 0){
            this.second = 59;
            this.minute = 59;
            this.hour = 23;
        }
        if (this.minute == 0 && this.second < 0){
            this.second = 59;
            this.minute = 59;
            this.hour = hour - 1;
        }
        if (this.minute <= 59 && this.second < 0){
            this.minute = minute - 1;
            this.second = 59;
        }
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        if (second >= 59){
            this.second = 0;
            this.minute++;
        }
        if (minute >= 59) {
            this.minute = 0;
            this.hour++;
        }
        if (hour > 23){
            this.hour = 0;
        }
    }
    public String toString() {
        String Hour = "" + hour;
        String Minute = "" + minute;
        String Second = "" + second;
        if (second < 10){
            Second = "0" + second;
        }
        if (minute < 10) {
            Minute = "0" + minute;
        }
        if (hour < 10){
            Hour = "0" + hour;
        }
        return Hour + ":" + Minute + ":" + Second;
    }
    public Time nextSecond(){
        this.second = second + 1;
        return new Time(hour,minute,second);
    }
    public Time previousSecond(){
        this.second = second - 1;
        return new Time(hour,minute,second);
    }
}