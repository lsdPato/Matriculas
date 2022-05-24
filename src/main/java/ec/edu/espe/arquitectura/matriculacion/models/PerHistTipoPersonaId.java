package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class PerHistTipoPersonaId implements Serializable {
    private static final long serialVersionUID = -4982123670064460220L;
    @Column(name = "cod_persona", nullable = false)
    private Integer codPersona;

    @Column(name = "cod_tipo_persona", nullable = false, length = 3)
    private String codTipoPersona;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PerHistTipoPersonaId entity = (PerHistTipoPersonaId) o;
        return Objects.equals(this.codPersona, entity.codPersona) &&
                Objects.equals(this.codTipoPersona, entity.codTipoPersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPersona, codTipoPersona);
    }

}