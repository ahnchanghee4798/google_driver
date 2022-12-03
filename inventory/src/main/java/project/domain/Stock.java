package project.domain;

import project.domain.StockReduced;
import project.domain.StockIncreased;
import project.InventoryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Stock_table")
@Data

public class Stock  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String qty;

    @PostPersist
    public void onPostPersist(){


        StockReduced stockReduced = new StockReduced(this);
        stockReduced.publishAfterCommit();



        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();

    }

    public static StockRepository repository(){
        StockRepository stockRepository = InventoryApplication.applicationContext.getBean(StockRepository.class);
        return stockRepository;
    }




    public static void updateStock(Shipping shipping){

        /** Example 1:  new item 
        Stock stock = new Stock();
        repository().save(stock);

        */

        /** Example 2:  finding and process
        
        repository().findById(shipping.get???()).ifPresent(stock->{
            
            stock // do something
            repository().save(stock);


         });
        */

        
    }
    public static void updateStock(ShippingCanceled shippingCanceled){

        /** Example 1:  new item 
        Stock stock = new Stock();
        repository().save(stock);

        */

        /** Example 2:  finding and process
        
        repository().findById(shippingCanceled.get???()).ifPresent(stock->{
            
            stock // do something
            repository().save(stock);


         });
        */

        
    }


}
