package ro.infrasoft.bff.dto;
import lombok.Data;

@Data
public class FormulaExecutorResponseDto {
    private String codAutoritate = "";
    private String codAutoritateId = "";
    private String dataScadenta = "";
    private String cuiAutoritateDeExecutare = "";
    private String adresaAutoritateaDeExecutare = "";
    private String adresaAutoritateaDeExecutareId = "";
    private String emailExecutor = "";
    private String tipProcedura = "";
}