package com.example.thymelef.utils;

import java.util.Random;

public class Utils {
    public static int RandomNumber(){
        Random rd = new Random();
        return rd.nextInt(3);
    }
}
