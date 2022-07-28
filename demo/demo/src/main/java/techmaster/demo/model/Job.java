package techmaster.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    //    Hãy định nghĩa một class Job gồm các trường:
//
//    id, kiểu String, mã tin tuyển dụng cần phải là duy nhất (unique)
//title: kiểu String, tiêu đề tuyển dụng
//description: kiểu String, mô tả tin tuyển dụng
//    location: [Hanoi, Hai Phong, Da Nang, Ho Chi Minh]
//    min_salary: int, lương tối thiểu
//    max_salary: int, lương tối đa
//    email_to: String, email nhà tuyển dụng
    private String id;
    private String title;
    private String description;
    //private enum location;
    public enum location {
        HANOI, HAIPHONG, DANANG, HOCHIMINH
    }
    private int min_salary;
    private int max_salary;
    private String email_to;


}
