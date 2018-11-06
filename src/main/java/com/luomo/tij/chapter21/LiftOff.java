package com.luomo.tij.chapter21;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-11-05.
 */
public class LiftOff implements Runnable {

    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ")";
    }

    @Override
    public void run() {
        while (countDown-- > 0){
            print(status());
            //声明"我已经执行完生命周期中最重要的部分了,此刻正是切换给其他任务执行一段时间的大好时机"
            Thread.yield();
        }
    }
}
