package kz.yerasyl.aparking;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "parking-sensor-topic", groupId = "parking-sensor-group")
    public void consume(String message) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        ParkingSensor parkingSensor = objectMapper.readValue(message, ParkingSensor.class);

        System.out.println("Received parking sensor data: " + parkingSensor.toString());
    }
}
