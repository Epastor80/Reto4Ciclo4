
package com.cuatroa.retodos.repository.crud;

import com.cuatroa.retodos.model.Fragance;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FraganceCrudRepository extends MongoRepository<Fragance, String> {
    public List<Fragance> findByPriceLessThanEqual(double precio);
}
