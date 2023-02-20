package dlo.demo1.data.internal;

import dlo.demo1.data.internal.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalRepository extends JpaRepository<Order, Long> {

}
