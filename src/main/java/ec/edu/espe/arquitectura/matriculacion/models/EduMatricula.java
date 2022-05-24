package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edu_matricula")
public class EduMatricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_matricula", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_inscripcion_estudiante", nullable = false)
    private EduInscripcionCarrera codInscripcionEstudiante;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_nrc", referencedColumnName = "cod_nrc", nullable = false),
            @JoinColumn(name = "cod_periodo", referencedColumnName = "cod_periodo", nullable = false)
    })
    private EduNrc eduNrc;

    @Column(name = "tipo", nullable = false)
    private Integer tipo;

    @Column(name = "modo", nullable = false, length = 32)
    private String modo;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "costo", nullable = false)
    private BigDecimal costo;

}