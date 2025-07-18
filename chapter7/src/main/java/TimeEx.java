// 7-13) 접근제어자를 통한 캡슐화

public class TimeEx {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
//        t.time = 13;    // private에 접근 불가
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}

class Time {
    private int hour, minute, second;

    Time (int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour()    { return hour; }
    public void setHour(int hour) {
        if (hour < 0 || minute > 59)    return;
        this.hour = hour;
    }

    public int getMinute()  { return minute; }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)  return;
        this.minute = minute;
    }

    public int getSecond() { return second; }
    public void setSecond(int second) {
        if (second < 0 || second > 59)  return;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
