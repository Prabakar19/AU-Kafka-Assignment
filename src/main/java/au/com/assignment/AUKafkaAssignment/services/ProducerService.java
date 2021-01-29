package au.com.assignment.AUKafkaAssignment.services;

import au.com.assignment.AUKafkaAssignment.dto.Rank;
import au.com.assignment.AUKafkaAssignment.dto.Student;
import au.com.assignment.AUKafkaAssignment.dto.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class ProducerService{


    private Logger logger = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendStudentDetails(Student student) {
        logger.info(String.format("Student created -> %s", student.toString()));
        kafkaTemplate.send("student", student);
    }

    public void sendTeacherDetails(Teacher teacher) {
        logger.info(String.format("Teacher created -> %s", teacher.toString()));
        kafkaTemplate.send("teacher", teacher);
    }
    public void sendRankDetails(Rank rank) {
        logger.info(String.format("Rank created -> %s", rank.toString()));
        kafkaTemplate.send("rank", rank);
    }
}
