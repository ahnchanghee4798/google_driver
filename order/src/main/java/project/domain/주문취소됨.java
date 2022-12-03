package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 주문취소됨 extends AbstractEvent {

    private Long id;
    private String adress;
    private String itemid;
    private Integer qty;
    private String adress;
    private String itemid;
    private Integer qty;
    private String adress;
    private String itemid;
    private Integer qty;
    private String adress;
    private String itemid;
    private Integer qty;
    private String customid;
    private String customid;

    public 주문취소됨(Order aggregate){
        super(aggregate);
    }
    public 주문취소됨(){
        super();
    }
}
