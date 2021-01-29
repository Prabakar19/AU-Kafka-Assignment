package au.com.assignment.AUKafkaAssignment.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Teacher {
    private int teacherId;
    private String teacherName;
    private String expertise;
}
