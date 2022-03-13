package com.consumer.rencanastudi.pubsub;

import com.consumer.rencanastudi.model.RencanaStudiModel;
import com.consumer.rencanastudi.pubsub.RencanaStudi;
import com.consumer.rencanastudi.repository.RencanaStudiDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Listener {
    @Autowired
    RencanaStudiDb rencanaStudiDb;

    @KafkaListener(topics = "coba3", groupId = "spring-consumer-1", containerFactory = "kafkaListenerContainerFactory")
    public void listenGroupFoo(@Payload RencanaStudi rencanaStudi, @Headers MessageHeaders headers) throws IOException {
        System.out.println("Received Message : " + rencanaStudi.toString());

        RencanaStudiModel resModel = new RencanaStudiModel(rencanaStudi.getNamaMahasiswa(), rencanaStudi.getDaftarMatkulId());
        rencanaStudiDb.save(resModel);
    }
}


