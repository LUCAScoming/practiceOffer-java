package timeTask;
//这里是定时任务


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTask {
    public static void main(String[] args) {
        System.out.println("nowTime"+new Date());
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task  run:" + new Date());
            }
        };
        Timer timer = new Timer();
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。这里是每3秒执行一次
        timer.schedule(timerTask, 1000, 5000);
    }


}
