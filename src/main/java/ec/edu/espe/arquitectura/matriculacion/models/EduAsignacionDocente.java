package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edu_asignacion_docente")
public class EduAsignacionDocente implements Serializable {
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

    public EduAsignacionDocente(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EduAsignacionDocente)) return false;
        EduAsignacionDocente that = (EduAsignacionDocente) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}