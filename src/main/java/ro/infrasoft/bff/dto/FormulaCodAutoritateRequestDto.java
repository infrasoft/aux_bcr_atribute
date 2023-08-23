package ro.infrasoft.bff.dto;

import lombok.Data;

@Data
public class FormulaCodAutoritateRequestDto {
    private String codAutoritate;
    private String cnpDebitor;
    private String cuiDebitor;
    private String tipOperatiune;
    private String idFisier;
}
