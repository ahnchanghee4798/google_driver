package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockReduced extends AbstractEvent {

    private Long id;

    public StockReduced(Stock aggregate){
        super(aggregate);
    }
    public StockReduced(){
        super();
    }
}
