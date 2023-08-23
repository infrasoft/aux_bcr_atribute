package ro.infrasoft.bff.enity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "ADRESE_TERT")
public class AdreseTert implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    private String id;

    @Column(name = "ID_TERT", nullable = false)
    private String idTert;

    @Column(name = "ADRESA")
    private String adresa;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PRINCIPAL")
    private String principal;

    @Column(name = "ID_TARA")
    private String idTara;

    @Column(name = "ID_JUDET")
    private String idJudet;

    @Column(name = "ID_LOCALITATE")
    private String idLocalitate;

    @Column(name = "ID_STRADA")
    private String idStrada;

    @Column(name = "NUMAR")
    private String numar;

    @Column(name = "BLOC")
    private String bloc;

    @Column(name = "SCARA")
    private String scara;

    @Column(name = "ETAJ")
    private String etaj;

    @Column(name = "APARTAMENT")
    private String apartament;

    @Column(name = "COD_POSTAL")
    private String codPostal;

    @Column(name = "CREAT_DE")
    private String creatDe;

    @Column(name = "CREAT_LA")
    private Date creatLa;

    @Column(name = "MODIFICAT_DE")
    private String modificatDe;

    @Column(name = "MODIFICAT_LA")
    private Date modificatLa;

    @Column(name = "ID_TIP_ADRESA")
    private String idTipAdresa;

    @Column(name = "ID_LOCALITATE2")
    private String idLocalitate2;

    @Column(name = "INTERFON")
    private String interfon;

    @Column(name = "ID_LOCALITATE3")
    private String idLocalitate3;

    @Column(name = "ID_OFICIU_POSTAL")
    private String idOficiuPostal;

    @Column(name = "OBSERVATII")
    private String observatii;

    @Column(name = "STRADA")
    private String strada;

    @Column(name = "ID_ADRESA")
    private String idAdresa;

}
