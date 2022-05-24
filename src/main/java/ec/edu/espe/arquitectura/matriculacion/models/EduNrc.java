package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edu_nrc")
public class EduNrc {
    @EmbeddedId
    private EduNrcId id;

    @MapsId("codPeriodo")
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_periodo", nullable = false)
    private EduPeriodo codPeriodo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_materia", nullable = false)
    private EduMateria codMateria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_docente")
    private EduAsignacionDocente codDocente;

    @Column(name = "cupos", nullable = false)
    private Integer cupos;

}