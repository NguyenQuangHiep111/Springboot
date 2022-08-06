package com.example.MINIPROJECT.service;

import com.example.MINIPROJECT.exception.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class BmiService {

//    Nếu BMI < 18.5 --> "Thiếu cân"
//    Nếu 18.5 <= BMI <= 24.9 --> "Bình thường"
//    Nếu 25 <= BMI <= 29.9 --> "Thừa cân"
//    Nếu BMI >= 30 --> "Béo phì"

    public double caulateBmi(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            throw new BadRequestException("Cân nặng chiều cao phải > 0");
        }
        return weight / (height * height);
//        double chiSoBMI = weight / (height * height);
//        //System.out.println("Chỉ số BMI = " + dcf.format(chiSoBMI));
//
//        // phân loại dựa vào chỉ số BMI
//        if (chiSoBMI < 18.5) {
//            return ("Bạn là người thiếu cân!");
//        } else if (chiSoBMI <= 24.9) {
//            return ("Bạn là người bình thường!");
//        } else if (chiSoBMI <= 29.9) {
//            return ("Bạn là người thừa cân!");
//        } else {
//            return ("Bạn là người béo phì !");
//        }
//
//        //System.out.println(ketQua);
//        //return 0;
    }
}
