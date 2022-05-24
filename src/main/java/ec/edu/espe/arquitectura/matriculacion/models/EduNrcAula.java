package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalTime;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edu_nrc_aula")
public class EduNrcAula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_nrc_aula", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_nrc", referencedColumnName = "cod_nrc", nullable = false),
            @JoinColumn(name = "cod_periodo", referencedColumnName = "cod_periodo", nullable = false)
    })
    private EduNrc eduNrc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_aula")
    private OfiAula codAula;

    @Column(name = "dia_semana", nullable = false, length = 25)
    private String diaSemana;

    @Column(name = "hora_inicio", nullable = false)
    private LocalTime horaInicio;

    @Column(name = "hora_fin", nullable = false)
    private LocalTime horaFin;

}