package ro.infrasoft.bff.enity;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Immutable
@Table(name = "V_EXECUTORI")
public class VExecutori implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    private String id;

    @Column(name = "ID_LEA", nullable = false)
    private String idLea;

    @Column(name = "NUME", nullable = false)
    private String nume;

    @Column(name = "COD_AFP")
    private String codAfp;

    @Column(name = "ADRESA_SCARA")
    private String adresaScara;

    @Column(name = "ADRESA_APARTAMENT")
    private String adresaApartament;

    @Column(name = "ADRESA_BLOC")
    private String adresaBloc;

    @Column(name = "CUI_CNP")
    private String cuiCnp;

    @Column(name = "MOD_COMUNICARE")
    private String modComunicare;

    @Column(name = "ADRESA_JUDET")
    private String adresaJudet;

    @Column(name = "ADRESA_EMAIL")
    private String adresaEmail;

    @Column(name = "ADRESA_FAX")
    private String adresaFax;

    @Column(name = "IBAN_PLATA_CHELT")
    private String ibanPlataChelt;

    @Column(name = "ADRESA_TELEFON")
    private String adresaTelefon;

    @Column(name = "ADRESA_COD_POSTAL")
    private String adresaCodPostal;

    @Column(name = "ADRESA_STRADA")
    private String adresaStrada;

    @Column(name = "ADRESA_NR_STRADA")
    private String adresaNrStrada;

    @Column(name = "ADRESA_LOCALITATE")
    private String adresaLocalitate;

    @Column(name = "TIP_ORGAN_EXECUTARE", nullable = false)
    private String tipOrganExecutare;

    @Column(name = "OBSERVATII")
    private String observatii;

    @Column(name = "CREAT_DE", nullable = false)
    private String creatDe;

    @Column(name = "CREAT_LA", nullable = false)
    private Date creatLa;

    @Column(name = "MODIFICAT_DE")
    private String modificatDe;

    @Column(name = "MODIFICAT_LA")
    private Date modificatLa;

}
