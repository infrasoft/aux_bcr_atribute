package ro.infrasoft.bff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.infrasoft.bff.A07291Result;
import ro.infrasoft.bff.enity.VExecutori;

public interface VExecutoriRepository extends JpaRepository<VExecutori, String>, JpaSpecificationExecutor<VExecutori> {

    @Query(value ="select * " +
            "  from (select id_lea, " +
            "               nume, " +
            "               cui_cnp cui, " +
            "               adresa_email email, " +
            "               ('strada ' ||  " +
            "                      coalesce(adresa_strada, '') || " +
            "                      ' nr ' || " +
            "                      coalesce(adresa_nr_strada, '') ||  " +
            "                      (case " +
            "                        when coalesce(adresa_bloc, '') != '' then " +
            "                         concat(' bloc ', coalesce(adresa_bloc, '')) " +
            "                        else " +
            "                         '' " +
            "                      end) || " +
            "                      (case " +
            "                        when coalesce(adresa_scara, '') != '' then " +
            "                         concat(' scara ', coalesce(adresa_scara, '')) " +
            "                        else " +
            "                         '' " +
            "                      end) || " +
            "                      (case " +
            "                        when coalesce(adresa_apartament, '') != '' then " +
            "                         concat(' apartament ', coalesce(adresa_apartament, '')) " +
            "                        else " +
            "                         '' " +
            "                      end) || " +
            "                      ' judet ' || " +
            "                      adresa_judet ||  " +
            "                      ' localitate ' || " +
            "                      adresa_localitate) adresa " +
            "          from v_executori) k " +
            " where id_lea = :id_lea and ROWNUM = 1"
    , nativeQuery = true)
    A07291Result executeA07291(@Param("id_lea") String idLea);
}