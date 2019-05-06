package ru.mail.evmenova.task22;

public class TimeInterval {
    int hour;
    int min;
    int sec;

    int numberOfSeconds;

    public TimeInterval(int sec) {
        this.sec = sec;
    }

    public TimeInterval(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int totalNumberOfSeconds() {
        numberOfSeconds = hour * 3600 + min * 60 + sec;
        return numberOfSeconds;

    }
    public int compareObjects(TimeInterval obj1, TimeInterval obj2) {
        if (obj1.numberOfSeconds > obj2.numberOfSeconds) {
            return 1;
        }else if (obj1.numberOfSeconds < obj2.numberOfSeconds) {
            return -1;
        }else{
            return 0;
        }
    }
    public void printResults(){
        System.out.println("Number of seconds in a given time interval: " + numberOfSeconds);
    }
}
