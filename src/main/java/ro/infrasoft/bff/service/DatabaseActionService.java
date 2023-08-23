package ro.infrasoft.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.infrasoft.bff.A07291Result;
import ro.infrasoft.bff.AdreseTertResult;
import ro.infrasoft.bff.CalendarResult;
import ro.infrasoft.bff.TertResult;
import ro.infrasoft.bff.dto.FormulaExecutorResponseDto;
import ro.infrasoft.bff.repository.AdreseTertRepository;
import ro.infrasoft.bff.repository.CalendarRepository;
import ro.infrasoft.bff.repository.TertRepository;
import ro.infrasoft.bff.repository.VExecutoriRepository;
import ro.infrasoft.bff.util.Util;

import java.util.Optional;

@Service
public class DatabaseActionService {

    @Autowired
    private VExecutoriRepository vExecutoriRepository;

    @Autowired
    private AdreseTertRepository adreseTertRepository;

    @Autowired
    private TertRepository tertRepository;

    @Autowired
    private CalendarRepository calendarRepository;

    public FormulaExecutorResponseDto formulaSelectExecutor(String idExecutor) {
        A07291Result a07291Result = vExecutoriRepository.executeA07291(idExecutor);
        AdreseTertResult adreseTertResult = adreseTertRepository.getIdAndAddressWhereIdTert(idExecutor);
        TertResult tertResult = tertRepository.getCodAutoritateAndCodAUtoritateIdFromTert(idExecutor);

        FormulaExecutorResponseDto formulaExecutorResponseDto = new FormulaExecutorResponseDto();

        formulaExecutorResponseDto.setCuiAutoritateDeExecutare(Util.notNull(a07291Result.getCui()));
        formulaExecutorResponseDto.setAdresaAutoritateaDeExecutare(Util.notNull(a07291Result.getAdresa()));

        formulaExecutorResponseDto.setAdresaAutoritateaDeExecutare(Util.notNull(adreseTertResult.getAdresa()));
        formulaExecutorResponseDto.setAdresaAutoritateaDeExecutareId(Util.notNull(adreseTertResult.getId()));

        formulaExecutorResponseDto.setCodAutoritate(Util.notNull(tertResult.getCodAutoritate()));
        formulaExecutorResponseDto.setCodAutoritateId(Util.notNull(tertResult.getCodAutoritateId()));

        return formulaExecutorResponseDto;
    }

    public void formulaSelectCodAutoritate(String ids) {
        CalendarResult valoareFromCalendarForExecutoriJudecatoresti = calendarRepository.getValoareFromCalendarForExecutoriJudecatoresti(ids);
        CalendarResult valoareFromCalendarForAdministratiileFinanciare = calendarRepository.getValoareFromCalendarForAdministratiileFinanciare(ids);
        CalendarResult valoareFromCalendar = calendarRepository.getValoareFromCalendar(ids);
    }
}
