package com.luomo.tij.chapter21;

import java.util.concurrent.ThreadFactory;

/**
 * @author LiuMei
 * @date 2018-11-05.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
