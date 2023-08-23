package ro.infrasoft.bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.infrasoft.bff.dto.FormulaCodAutoritateRequestDto;
import ro.infrasoft.bff.dto.FormulaExecutorResponseDto;
import ro.infrasoft.bff.service.DatabaseActionService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class DatabaseActionController {

    @Autowired
    private DatabaseActionService databaseActionService;

    @CrossOrigin("*")
    @GetMapping(value = "/formula/executor/{idExecutor}")
    public FormulaExecutorResponseDto formulaSelectExecutor(@PathVariable String idExecutor) throws Exception {
        Thread.sleep(5000);
        return databaseActionService.formulaSelectExecutor(idExecutor);
    }

    @CrossOrigin("*")
    @PostMapping(value = "/formula/cod-autoritate")
    public FormulaExecutorResponseDto formulaCodAutoritate(@RequestBody FormulaCodAutoritateRequestDto formulaCodAutoritateRequestDto) {
        System.out.println(formulaCodAutoritateRequestDto);
        return new FormulaExecutorResponseDto();
    }
}
