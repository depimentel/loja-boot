package br.com.caelum.fj27.repositories;

import br.com.caelum.fj27.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nando on 12/07/17.
 */
@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long>{
}
