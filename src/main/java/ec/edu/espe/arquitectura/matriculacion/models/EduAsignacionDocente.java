package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edu_asignacion_docente")
public class EduAsignacionDocente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_docente", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "cod_persona", referencedColumnName = "cod_persona"),
            @JoinColumn(name = "cod_tipo_persona", referencedColumnName = "cod_tipo_persona")
    })
    private PerHistTipoPersona perHistTipoPersona;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

}