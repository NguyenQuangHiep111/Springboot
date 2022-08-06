package com.example.MINIPROJECT.service;

import com.example.MINIPROJECT.exception.BadRequestException;
import org.springframework.stereotype.Service;


import java.util.Random;

@Service
public class ColorService {
    public String randomColor (int type){
       return switch (type){
           case 1 -> randomColorName();
           case 2 ->randomHexColorName();
           case 3 ->randomRgbColorName();
           default -> throw new BadRequestException("Type k hợp lệ");
       };
    }

    public String randomColorName(){
        //Định nghĩa 1 mảng => Lấy random 1 giá trị trong mảng
        String[] colors={"red", "blue", "black", "green", "yellow"};

        Random rd =new Random();
        int randomNumber=rd.nextInt(colors.length);
        //System.out.println(arr[randomNumber]);
        return colors[randomNumber];
    }

    public String randomHexColorName(){
        // [0-9] [a->f]
//        Random random = new Random();
//        int nextInt = random.nextInt(256*256*256);
//        System.out.println(String.format("#%06x", nextInt));
        return "#f44336";
        ///return random;
    }

    public String randomRgbColorName(){
        //0 -> 255

//        int R = (int)(Math.random()*256);
//        int G = (int)(Math.random()*256);
//        int B= (int)(Math.random()*256);
//        Color color = new Color(R, G, B); //random color, but can be bright or dull

//to get rainbow, pastel colors
//        Random random = new Random();
//        final float hue = random.nextFloat();
//        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
//        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
//        color = Color.getHSBColor(hue, saturation, luminance);
        return "rgb(96, 125, 139)";
    }
}
