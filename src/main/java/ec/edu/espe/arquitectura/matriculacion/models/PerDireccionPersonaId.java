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
import java.math.BigDecimal;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class PerDireccionPersonaId implements Serializable {
    private static final long serialVersionUID = 331632574879520740L;
    @Column(name = "cod_persona", nullable = false)
    private Integer codPersona;

    @Column(name = "sec_direccion", nullable = false, precision = 2)
    private BigDecimal secDireccion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PerDireccionPersonaId entity = (PerDireccionPersonaId) o;
        return Objects.equals(this.codPersona, entity.codPersona) &&
                Objects.equals(this.secDireccion, entity.secDireccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPersona, secDireccion);
    }

}