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
public class PerFamiliarPersonaId implements Serializable {
    private static final long serialVersionUID = 7674507135421064750L;
    @Column(name = "cod_persona", nullable = false)
    private Integer codPersona;

    @Column(name = "sec_familiar_persona", nullable = false, precision = 2)
    private BigDecimal secFamiliarPersona;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PerFamiliarPersonaId entity = (PerFamiliarPersonaId) o;
        return Objects.equals(this.codPersona, entity.codPersona) &&
                Objects.equals(this.secFamiliarPersona, entity.secFamiliarPersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPersona, secFamiliarPersona);
    }

}