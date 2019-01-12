package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class JavaTimer {
	
	public static void main(String[] args) {
        try {
            // 创建定时器
            Timer timer = new Timer();
            // 添加调度任务
            // 安排指定的任务在指定的时间开始进行重复的 固定延迟执行
            timer.schedule(new MyTask(),
            		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-08 18:10:10"), 10*1000);
            // 安排指定的任务在指定的延迟后开始进行重复的 固定速率执行
            //timer.scheduleAtFixedRate(new MyTask(),new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-06-24 22:31:10"),10*1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}


class MyTask extends TimerTask{

    // 定义调度任务
    public void run() {
        System.out.println("log2:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}


