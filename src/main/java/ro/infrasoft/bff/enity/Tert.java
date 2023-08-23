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
@Table(name = "TERT")
public class Tert implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    private String id;

    @Column(name = "PREFIX")
    private String prefix;

    @Column(name = "NUME", nullable = false)
    private String nume;

    @Column(name = "SUFIX")
    private String sufix;

    @Column(name = "RJ")
    private String rj;

    @Column(name = "COD_CUI")
    private String codCui;

    @Column(name = "COD_FISCAL")
    private String codFiscal;

    @Column(name = "CLIENT", nullable = false)
    private String client;

    @Column(name = "FURNIZOR", nullable = false)
    private String furnizor;

    @Column(name = "PFA")
    private String pfa;

    @Column(name = "ID_UNITATE_SUPERIOARA")
    private String idUnitateSuperioara;

    @Column(name = "ID_LIMBA")
    private String idLimba;

    @Column(name = "ID_MONEDA")
    private String idMoneda;

    @Column(name = "BLOCAT")
    private String blocat;

    @Column(name = "CREAT_DE", nullable = false)
    private String creatDe;

    @Column(name = "CREAT_LA", nullable = false)
    private Date creatLa;

    @Column(name = "MODIFICAT_DE")
    private String modificatDe;

    @Column(name = "MODIFICAT_LA")
    private Date modificatLa;

    @Column(name = "ID_UNITATE")
    private String idUnitate;

    @Column(name = "PLATESTE_TVA", nullable = false)
    private String platesteTva;

    @Column(name = "CAPITAL_SOCIAL")
    private String capitalSocial;

    @Column(name = "ID_COTA_TVA")
    private String idCotaTva;

    @Column(name = "ADRESA")
    private String adresa;

    @Column(name = "ID_JUDET")
    private String idJudet;

    @Column(name = "COD_POSTAL")
    private String codPostal;

    @Column(name = "ID_BANCA_GEN")
    private String idBancaGen;

    @Column(name = "NUME_SUCURSALA")
    private String numeSucursala;

    @Column(name = "CONT_BANCAR")
    private String contBancar;

    @Column(name = "TELEFON")
    private String telefon;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "WEB")
    private String web;

    @Column(name = "INFO")
    private String info;

    @Column(name = "PERSOANA_CONTACT")
    private String persoanaContact;

    @Column(name = "PERS_FIZ")
    private String persFiz;

    @Column(name = "COD")
    private String cod;

    @Column(name = "DOMENIU_DE_ACTIVITATE")
    private String domeniuDeActivitate;

    @Column(name = "EXTERN")
    private String extern;

    @Column(name = "TARA")
    private String tara;

    @Column(name = "ID_LOCALITATE")
    private String idLocalitate;

    @Column(name = "ID_TARA")
    private String idTara;

    @Column(name = "COD_CAEN")
    private String codCaen;

    @Column(name = "TVA_INCASARE")
    private String tvaIncasare;

    @Column(name = "ZILE_SCADENTA")
    private String zileScadenta;

    @Column(name = "LIMITA_CREDIT")
    private String limitaCredit;

    @Column(name = "ID_MONEDA_CREDIT")
    private String idMonedaCredit;

    @Column(name = "SERIE_FACTURI")
    private String serieFacturi;

    @Column(name = "ID_CATEGORIE_PARTENER")
    private String idCategoriePartener;

    @Column(name = "ID_AGENT")
    private String idAgent;

    @Column(name = "REMINDER")
    private String reminder;

    @Column(name = "DATA_REMINDER")
    private Date dataReminder;

    @Column(name = "ID_CRM_ACTIUNE")
    private String idCrmActiune;

    @Column(name = "ORA_REMINDER_MEMENTO")
    private String oraReminderMemento;

    @Column(name = "TELEFON2")
    private String TELEFON2;

    @Column(name = "CONTACT_FUNCTIE")
    private String contactFunctie;

    @Column(name = "BANCA")
    private String banca;

    @Column(name = "FACTURA_ELECTRONICA")
    private String facturaElectronica;

    @Column(name = "ID_BANCA_GEN2")
    private String idBancaGen2;

    @Column(name = "CONT_BANCAR2")
    private String contBancar2;

    @Column(name = "NUME_SUCURSALA2")
    private String numeSucursala2;

    @Column(name = "ID_CRM_DOMENIU")
    private String idCrmDomeniu;

    @Column(name = "ID_CRM_SURSA")
    private String idCrmSursa;

    @Column(name = "ID_CRM_STATUS")
    private String idCrmStatus;

    @Column(name = "ID_UNITATE_COPIL")
    private String idUnitateCopil;

    @Column(name = "EMAIL2")
    private String EMAIL2;

    @Column(name = "EMAIL3")
    private String EMAIL3;

    @Column(name = "EMAIL4")
    private String EMAIL4;

    @Column(name = "EMAIL5")
    private String EMAIL5;

    @Column(name = "STRADA")
    private String strada;

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

    @Column(name = "ID_LOCALITATE2")
    private String idLocalitate2;

    @Column(name = "ID_JUDET2")
    private String idJudet2;

    @Column(name = "ID_TARA2")
    private String idTara2;

    @Column(name = "CNP")
    private String cnp;

    @Column(name = "SERIE_ACT")
    private String serieAct;

    @Column(name = "NUMAR_ACT")
    private String numarAct;

    @Column(name = "ELIBERAT_DE")
    private String eliberatDe;

    @Column(name = "DATA_ELIBERARII")
    private Date dataEliberarii;

    @Column(name = "REPREZ_LEGAL")
    private String reprezLegal;

    @Column(name = "ID_TIP_ACT")
    private String idTipAct;

    @Column(name = "COD_IBAN")
    private String codIban;

    @Column(name = "ID_LISTA_PRET")
    private String idListaPret;

    @Column(name = "NOTE_REMINDER")
    private String noteReminder;

    @Column(name = "COD_ATM")
    private String codAtm;

    @Column(name = "TIP_CLIENT")
    private String tipClient;

    @Column(name = "NLC")
    private String nlc;

    @Column(name = "TIP_CLIENT_MOD")
    private String tipClientMod;

    @Column(name = "CONTRACTOR")
    private String contractor;

    @Column(name = "PARTENER")
    private String partener;

    @Column(name = "POTENTIAL_CONTR")
    private String potentialContr;

    @Column(name = "MAMA")
    private String mama;

    @Column(name = "TATA")
    private String tata;

    @Column(name = "PRENUME")
    private String prenume;

    @Column(name = "DATA_NASTERE")
    private Date dataNastere;

    @Column(name = "COD_SAP")
    private String codSap;

    @Column(name = "STARE")
    private String stare;

    @Column(name = "ROL")
    private String rol;

    @Column(name = "ID_STRADA")
    private String idStrada;

    @Column(name = "PACIENT")
    private String pacient;

    @Column(name = "ID_PUNCT_LUCRU")
    private String idPunctLucru;

    @Column(name = "ID_UNITATE_LOGISTICA")
    private String idUnitateLogistica;

    @Column(name = "ID_TIP_NOTAR")
    private String idTipNotar;

    @Column(name = "NOTAR")
    private String notar;

    @Column(name = "TIP_TERT")
    private String tipTert;

    @Column(name = "ID_FOLDER")
    private String idFolder;

    @Column(name = "SUSPENDAT")
    private String suspendat;

    @Column(name = "RADIAT")
    private String radiat;

    @Column(name = "ACT_VALID_DE_LA")
    private Date actValidDeLa;

    @Column(name = "ACT_VALID_PANA_LA")
    private Date actValidPanaLa;

    @Column(name = "INFO_ACTIVITATE_ANTERIOARA")
    private String infoActivitateAnterioara;

    @Column(name = "STUDII")
    private String studii;

    @Column(name = "ID_CALITATE")
    private String idCalitate;

    @Column(name = "SERIE_AUTORIZATIE")
    private String serieAutorizatie;

    @Column(name = "NUMAR_AUTORIZATIE")
    private String numarAutorizatie;

    @Column(name = "DATA_AUTORIZATIE")
    private Date dataAutorizatie;

    @Column(name = "ID_FORMA_ORGANIZARE")
    private String idFormaOrganizare;

    @Column(name = "NUME_VECHI")
    private String numeVechi;

    @Column(name = "NUMAR_DOSAR")
    private String numarDosar;

    @Column(name = "NUMAR_REGISTRU_SPECIAL")
    private String numarRegistruSpecial;

    @Column(name = "ASOCIAT")
    private String asociat;

    @Column(name = "SIGNATURE_TYPE")
    private String signatureType;

    @Column(name = "NUMAR_LEGITIMATIE")
    private String numarLegitimatie;

    @Column(name = "ID_CALITATE_PROCESUALA")
    private String idCalitateProcesuala;

    @Column(name = "ID_INSTITUTIE")
    private String idInstitutie;

    @Column(name = "ID_CATEGORIE")
    private String idCategorie;

    @Column(name = "INSTITUTIE")
    private String institutie;

    @Column(name = "NUMAR_MAPA_PROFESIONALA")
    private String numarMapaProfesionala;

    @Column(name = "ID_SEMNATAR1")
    private String idSemnatar1;

    @Column(name = "ID_SEMNATAR2")
    private String idSemnatar2;

    @Column(name = "CERT_CONST_NR")
    private String certConstNr;

    @Column(name = "CERT_CONST_DATA_EMITERE")
    private Date certConstDataEmitere;

    @Column(name = "CERT_CONST_ID_JUDET")
    private String certConstIdJudet;

    @Column(name = "P2")
    private String p2;

    @Column(name = "P3")
    private String p3;

    @Column(name = "COD_AUTORITATE")
    private String codAutoritate;

    @Column(name = "ID_TERT_PARINTE")
    private String idTertParinte;

    @Column(name = "DATA_CONEXARE")
    private Date dataConexare;

    @Column(name = "SWIFT")
    private String swift;

    @Column(name = "ATRIBUT_FISCAL")
    private String atributFiscal;

    @Column(name = "ELIGIBIL")
    private String eligibil;

    @Column(name = "FURNIZOR_EE")
    private String furnizorEe;

    @Column(name = "FIRMA_MAMA")
    private String firmaMama;

    @Column(name = "ADRESA_CORESPONDENTA")
    private String adresaCorespondenta;

    @Column(name = "CONTACT_FORMATOR")
    private String contactFormator;

    @Column(name = "ID_TIP_FORMATOR")
    private String idTipFormator;

    @Column(name = "ID_FORMA_PROPRIETATE")
    private String idFormaProprietate;

    @Column(name = "DURATA")
    private String durata;

    @Column(name = "ID_TIP_CAPITAL")
    private String idTipCapital;

    @Column(name = "ID_COD_CAEN")
    private String idCodCaen;

    @Column(name = "OBIECT_ACTIVITATE")
    private String obiectActivitate;

    @Column(name = "COD_CAEN_STR")
    private String codCaenStr;

    @Column(name = "DURATA_CONSTITUIRE")
    private String durataConstituire;

    @Column(name = "ID_STARE_FIRMA")
    private String idStareFirma;

    @Column(name = "ID_SISTEM_VECHI")
    private String idSistemVechi;

    @Column(name = "COD_ACER")
    private String codAcer;

    @Column(name = "ID_TIP_PERSOANA")
    private String idTipPersoana;

    @Column(name = "FUNCTIE_REPREZ_LEGAL")
    private String functieReprezLegal;

    @Column(name = "CONSOLIDAT")
    private String consolidat;

    @Column(name = "FALIMENT")
    private String faliment;

    @Column(name = "ID_CETATENIE")
    private String idCetatenie;

    @Column(name = "ID_ETNIE")
    private String idEtnie;

    @Column(name = "ID_MESERIE")
    private String idMeserie;

    @Column(name = "ID_STARE_CIVILA")
    private String idStareCivila;

    @Column(name = "ID_STATUT_SOCIAL")
    private String idStatutSocial;

    @Column(name = "ID_NIVEL_EDUCATIONAL")
    private String idNivelEducational;

    @Column(name = "LOC_NASTERE")
    private String locNastere;

    @Column(name = "CNP_TATA")
    private String cnpTata;

    @Column(name = "NUME_TATA")
    private String numeTata;

    @Column(name = "PRENUME_TATA")
    private String prenumeTata;

    @Column(name = "CNP_MAMA")
    private String cnpMama;

    @Column(name = "NUME_MAMA")
    private String numeMama;

    @Column(name = "PRENUME_MAMA")
    private String prenumeMama;

    @Column(name = "DATA_EMITERE_ACT")
    private Date dataEmitereAct;

    @Column(name = "DATA_EXPIRARE_ACT")
    private Date dataExpirareAct;

    @Column(name = "EMITENT_ACT")
    private String emitentAct;

    @Column(name = "ID_TIP_ADRESA")
    private String idTipAdresa;

    @Column(name = "ID_OFICIU_POSTAL")
    private String idOficiuPostal;

    @Column(name = "INTERFON")
    private String interfon;

    @Column(name = "ID_MODALITATE_PLATA")
    private String idModalitatePlata;

    @Column(name = "ID_OFICIU_PLATA")
    private String idOficiuPlata;

    @Column(name = "ACTIV")
    private String activ;

    @Column(name = "ID_EXECUTOR")
    private String idExecutor;

    @Column(name = "ID_EXECUTOR2")
    private String idExecutor2;

}
