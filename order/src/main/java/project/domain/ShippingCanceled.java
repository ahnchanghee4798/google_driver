package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import lombok.*;
import java.util.*;
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
}


