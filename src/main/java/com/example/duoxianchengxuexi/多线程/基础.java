package com.example.duoxianchengxuexi.多线程;

import java.util.concurrent.TimeUnit;

public class 基础 {


    public  static class t1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                TimeUnit.MICROSECONDS.sleep(1);
            }
        }
    }


    public static void main(String[] args) {

    }
}
