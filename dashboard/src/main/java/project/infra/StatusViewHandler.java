package project.infra;

import project.domain.*;
import project.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class StatusViewHandler {

    @Autowired
    private StatusRepository statusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrdered_then_CREATE_1 (@Payload Ordered ordered) {
        try {

            if (!ordered.validate()) return;

            // view 객체 생성
            Status status = new Status();
            // view 객체에 이벤트의 Value 를 set 함
            status.setId(ordered.getId());
            status.setStatus("주문됨");
            status.setStatus("주문됨");
            // view 레파지 토리에 save
            statusRepository.save(status);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrdered_then_UPDATE_1(@Payload Ordered ordered) {
        try {
            if (!ordered.validate()) return;
                // view 객체 조회
            Optional<Status> statusOptional = statusRepository.findById(ordered.getId());

            if( statusOptional.isPresent()) {
                 Status status = statusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                status.setStatus("배송됨");    
                // view 레파지 토리에 save
                 statusRepository.save(status);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void when주문취소됨_then_UPDATE_2(@Payload 주문취소됨 주문취소됨) {
        try {
            if (!주문취소됨.validate()) return;
                // view 객체 조회
            Optional<Status> statusOptional = statusRepository.findById(주문취소됨.getId());

            if( statusOptional.isPresent()) {
                 Status status = statusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                status.setStatus("주문취소됨");    
                // view 레파지 토리에 save
                 statusRepository.save(status);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void when주문취소됨_then_UPDATE_3(@Payload 주문취소됨 주문취소됨) {
        try {
            if (!주문취소됨.validate()) return;
                // view 객체 조회
            Optional<Status> statusOptional = statusRepository.findById(주문취소됨.getId());

            if( statusOptional.isPresent()) {
                 Status status = statusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                status.setStatus("주문취소됨");    
                // view 레파지 토리에 save
                 statusRepository.save(status);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

