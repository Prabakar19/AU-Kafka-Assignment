package au.com.assignment.AUKafkaAssignment.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Rank {
    private int studentId;
    private String studentName;
    private Date submissionDate;
    private int rankOfStud;
}
