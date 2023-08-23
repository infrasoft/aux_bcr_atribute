package ro.infrasoft.bff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.infrasoft.bff.AdreseTertResult;
import ro.infrasoft.bff.enity.AdreseTert;

public interface AdreseTertRepository extends JpaRepository<AdreseTert, String>, JpaSpecificationExecutor<AdreseTert> {
    @Query(value = "SELECT ID, ADRESA from adrese_tert where id_tert = :id_tert and ROWNUM = 1", nativeQuery = true)
    AdreseTertResult getIdAndAddressWhereIdTert(@Param("id_tert") String id_tert);
}