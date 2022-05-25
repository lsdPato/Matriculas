package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edu_malla_carrera")
public class EduMallaCarrera implements Serializable {
    @Id
    @Column(name = "cod_materiacarrera", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_materia", nullable = false)
    private EduMateria codMateria;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_carrera", nullable = false)
    private EduCarrera codCarrera;

    @Column(name = "nivel")
    private Integer nivel;

    public EduMallaCarrera(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EduMallaCarrera)) return false;
        EduMallaCarrera that = (EduMallaCarrera) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}