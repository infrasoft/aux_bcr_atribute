package ro.infrasoft.bff.enity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "CALENDAR")
public class Calendar implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ZI", nullable = false)
    private Date zi;

    /**
     * L-Lucratoare, S-Sambata, D-Duminica, H- Sarbatoare Legla
     */
    @Column(name = "TIP", nullable = false)
    private String tip;

    @Column(name = "ID")
    private String id;

}
