package ro.infrasoft.bff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.infrasoft.bff.CalendarResult;
import ro.infrasoft.bff.enity.Calendar;

import java.util.Date;

public interface CalendarRepository extends JpaRepository<Calendar, Date>, JpaSpecificationExecutor<Calendar> {
    @Query(value = "select ZI VALOARE from (select ZI,tip from calendar where TRUNC(zi) >= TRUNC(coalesce((SELECT MAX(CREAT_LA) from fisiere where id = :ids),sysdate) + 6) and tip not in ('S','D','H') order by zi asc ) WHERE ROWNUM <= 1", nativeQuery = true)
    CalendarResult getValoareFromCalendarForExecutoriJudecatoresti(@Param("ids") String ids);

    @Query(value = " select ZI VALOARE from (select ZI,tip from calendar where TRUNC(zi) >= TRUNC(coalesce((SELECT MAX(CREAT_LA) from fisiere where id = :ids),sysdate) + 1) and tip not in ('S','D','H') order by zi asc ) WHERE ROWNUM <= 1", nativeQuery = true)
    CalendarResult getValoareFromCalendarForAdministratiileFinanciare(@Param("ids") String ids);

    @Query(value = "select ZI VALOARE from (select ZI,tip from calendar where TRUNC(zi) >= TRUNC(coalesce((SELECT MAX(CREAT_LA) from fisiere where id = :ids),sysdate) + 1) and tip not in ('S','D','H') order by zi asc ) WHERE ROWNUM <= 1", nativeQuery = true)
    CalendarResult getValoareFromCalendar(@Param("ids") String ids);
}