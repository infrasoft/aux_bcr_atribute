package ro.infrasoft.bff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.infrasoft.bff.TertResult;
import ro.infrasoft.bff.enity.Tert;

public interface TertRepository extends JpaRepository<Tert, String>, JpaSpecificationExecutor<Tert> {
    @Query(value = "SELECT distinct c.nume cod_autoritate, c.id cod_autoritate_id from tert t join cod_autoritate c on t.cod_autoritate = c.id where t.id = :executor and ROWNUM = 1", nativeQuery = true)
    TertResult getCodAutoritateAndCodAUtoritateIdFromTert(@Param("executor") String executor);
}