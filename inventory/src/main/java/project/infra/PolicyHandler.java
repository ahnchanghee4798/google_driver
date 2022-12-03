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
    @Autowired StockRepository stockRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Shipping'")
    public void wheneverShipping_UpdateStock(@Payload Shipping shipping){

        Shipping event = shipping;
        System.out.println("\n\n##### listener UpdateStock : " + shipping + "\n\n");


        

        // Sample Logic //
        Stock.updateStock(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ShippingCanceled'")
    public void wheneverShippingCanceled_UpdateStock(@Payload ShippingCanceled shippingCanceled){

        ShippingCanceled event = shippingCanceled;
        System.out.println("\n\n##### listener UpdateStock : " + shippingCanceled + "\n\n");


        

        // Sample Logic //
        Stock.updateStock(event);
        

        

    }

}


