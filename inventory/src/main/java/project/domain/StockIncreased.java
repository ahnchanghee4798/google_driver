package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String qty;

    public StockIncreased(Stock aggregate){
        super(aggregate);
    }
    public StockIncreased(){
        super();
    }
}
