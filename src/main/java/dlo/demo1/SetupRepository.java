package dlo.demo1;

import dlo.demo1.data.common.type.Type;
import dlo.demo1.data.external.domain.ExternalData;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetupRepository extends JpaRepository<ExternalData, Long> {

    Optional<List<ExternalData>> findAllByType(Type type);
}
