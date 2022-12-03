package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ShippingCanceled extends AbstractEvent {

    private Long id;
    private Integer qty;
    private String adress;
    private String itemid;
    private Long orderId;
    private String status;
    private Integer qty;
    private String adress;
    private String itemid;
    private Long orderId;
    private String status;

    public ShippingCanceled(Shipping aggregate){
        super(aggregate);
    }
    public ShippingCanceled(){
        super();
    }
}
