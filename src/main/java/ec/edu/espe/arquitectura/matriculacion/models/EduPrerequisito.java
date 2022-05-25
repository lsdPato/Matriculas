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
@Table(name = "edu_prerequisito")
public class EduPrerequisito implements Serializable {
    @Id
    @Column(name = "cod_prerequisito", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_materia_padre", nullable = false)
    private EduMateria codMateriaPadre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "edu_cod_materia", nullable = false)
    private EduMateria eduCodMateria;

    @Column(name = "agrupacion_prerequisitos", nullable = false)
    private Integer agrupacionPrerequisitos;

    public EduPrerequisito(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EduPrerequisito)) return false;
        EduPrerequisito that = (EduPrerequisito) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}