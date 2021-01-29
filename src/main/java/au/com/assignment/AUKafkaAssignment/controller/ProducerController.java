package au.com.assignment.AUKafkaAssignment.controller;

import au.com.assignment.AUKafkaAssignment.dto.Rank;
import au.com.assignment.AUKafkaAssignment.dto.Student;
import au.com.assignment.AUKafkaAssignment.dto.Teacher;
import au.com.assignment.AUKafkaAssignment.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/kafka/api")
public class ProducerController {

    private static int rank = 1;
    @Autowired
    ProducerService producerService;

    @PostMapping("/student")
    public void sendMessageToStudent(@RequestBody Student student){
            producerService.sendStudentDetails(student);
    }

    @PostMapping("/teacher")
    public void sendMessageToTeacher(@RequestBody Teacher teacher){
        producerService.sendTeacherDetails(teacher);
    }

    @PostMapping("/rank")
    public void sendMessageToRank(@RequestBody Rank rank){
        rank.setSubmissionDate(new Date());
        rank.setRankOfStud(this.rank++);
        producerService.sendRankDetails(rank);
    }
}
