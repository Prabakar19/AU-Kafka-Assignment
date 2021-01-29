package au.com.assignment.AUKafkaAssignment.services;

import au.com.assignment.AUKafkaAssignment.dto.Rank;
import au.com.assignment.AUKafkaAssignment.dto.Student;
import au.com.assignment.AUKafkaAssignment.dto.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService {

    private Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics= "student", groupId = "mygroup")
    public void consume(Student student){
        logger.info(String.format("Student created -> %s", student.toString()));
    }

    @KafkaListener(topics= "teacher", groupId = "mygroup")
    public void consume(Teacher teacher){
        logger.info(String.format("Teacher created -> %s", teacher.toString()));
    }

    @KafkaListener(topics= "rank", groupId = "mygroup")
    public void consume(Rank rank){
        logger.info(String.format("Rank created -> %s", rank.toString()));
    }
}
