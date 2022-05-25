package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edu_nrc_aula")
public class EduNrcAula implements Serializable {
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

    public EduNrcAula(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EduNrcAula)) return false;
        EduNrcAula that = (EduNrcAula) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}