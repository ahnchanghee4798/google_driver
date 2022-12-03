package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Shipping extends AbstractEvent {

    private Long id;
    private String qty;
    private String itemid;
    private String adress;
    private Long orderId;
    private Integer qty;
    private String status;
    private Integer qty;
    private String status;

    public Shipping(Shipping aggregate){
        super(aggregate);
    }
    public Shipping(){
        super();
    }
}
