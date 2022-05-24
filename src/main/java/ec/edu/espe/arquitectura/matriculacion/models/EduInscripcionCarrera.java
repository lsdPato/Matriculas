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
@Table(name = "edu_inscripcion_carrera")
public class EduInscripcionCarrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_inscripcion_carrera", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_carrera", nullable = false)
    private EduCarrera codCarrera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "cod_persona", referencedColumnName = "cod_persona"),
            @JoinColumn(name = "cod_tipo_persona", referencedColumnName = "cod_tipo_persona")
    })
    private PerHistTipoPersona perHistTipoPersona;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

}