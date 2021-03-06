package com.luomo.tij.chapter21;

import java.util.ArrayList;
import java.util.concurrent.*;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-11-05.
 */

class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}

public class CallableDemo{

    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for(int i=0;i<10;i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for(Future<String> fs : results){
            try {
                print(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                exec.shutdown();
            }
        }
    }

}
