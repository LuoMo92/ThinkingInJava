package com.luomo.tij.chapter2.practice6;

/**
 * @author LiuMei
 * @date 2018-03-28.
 */
public class StorageTest {

    public static void main(String[] args) {
        class StoreStuff {
            int storage(String s) {
                return s.length() * 2;
            }
        }

        StoreStuff storeStuff = new StoreStuff();
        System.out.println(storeStuff.storage("test"));
    }

}
