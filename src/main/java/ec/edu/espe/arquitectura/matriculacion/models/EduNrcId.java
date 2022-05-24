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
public class EduNrcId implements Serializable {
    private static final long serialVersionUID = 4963226821099427988L;
    @Column(name = "cod_nrc", nullable = false, precision = 4)
    private BigDecimal codNrc;

    @Column(name = "cod_periodo", nullable = false)
    private Integer codPeriodo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EduNrcId entity = (EduNrcId) o;
        return Objects.equals(this.codPeriodo, entity.codPeriodo) &&
                Objects.equals(this.codNrc, entity.codNrc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPeriodo, codNrc);
    }

}