package com.averkina;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimer{
    private long second;
    private Date date;
    private Timer timer;

    public long getSecond() {
        return second;
    }
    public void run() {
        timer = new Timer();

        System.out.println("Секундомер запущен: " + new Date());
        TimerTask task = new TimerTask() {
            int second = 1;

            public void run() {
                second++;
            }
        };

        date = new Date();
        timer.schedule(task, date, 1000);
    }
    public void stop() {
        if(timer != null) {
            timer.cancel();
            Date date_temp = new Date();
            second = (date_temp.getTime() - date.getTime()) / 1000 % 60;
            System.out.println("Секундомер выключен: " + new Date());
        }
        else {
            System.out.println("Секундомер уже выключен!");
        }
    }
}
