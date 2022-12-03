package project.domain;

import project.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="shippings", path="shippings")
public interface ShippingRepository extends PagingAndSortingRepository<Shipping, Long>{

}
