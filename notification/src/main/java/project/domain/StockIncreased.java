package project.domain;

import project.domain.*;
import project.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String qty;
}


