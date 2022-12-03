package project.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import project.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import project.domain.*;

@Service
@Transactional
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Shipping'")
    public void wheneverShipping_문자메시지를발송한다(@Payload Shipping shipping){

        Shipping event = shipping;
        System.out.println("\n\n##### listener 문자메시지를발송한다 : " + shipping + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ShippingCanceled'")
    public void wheneverShippingCanceled_문자메시지를발송한다(@Payload ShippingCanceled shippingCanceled){

        ShippingCanceled event = shippingCanceled;
        System.out.println("\n\n##### listener 문자메시지를발송한다 : " + shippingCanceled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='StockIncreased'")
    public void wheneverStockIncreased_문자메시지를발송한다(@Payload StockIncreased stockIncreased){

        StockIncreased event = stockIncreased;
        System.out.println("\n\n##### listener 문자메시지를발송한다 : " + stockIncreased + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordered'")
    public void wheneverOrdered_문자메시지를발송한다(@Payload Ordered ordered){

        Ordered event = ordered;
        System.out.println("\n\n##### listener 문자메시지를발송한다 : " + ordered + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문취소됨'")
    public void whenever주문취소됨_문자메시지를발송한다(@Payload 주문취소됨 주문취소됨){

        주문취소됨 event = 주문취소됨;
        System.out.println("\n\n##### listener 문자메시지를발송한다 : " + 주문취소됨 + "\n\n");


        

        // Sample Logic //

        

    }

}


