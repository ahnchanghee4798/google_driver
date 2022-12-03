package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Ordered extends AbstractEvent {

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

    public Ordered(Order aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
