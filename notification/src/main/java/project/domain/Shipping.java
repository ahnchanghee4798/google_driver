package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import lombok.*;
import java.util.*;
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
}


