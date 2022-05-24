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
public class GenPaisEstructuraId implements Serializable {
    private static final long serialVersionUID = -524232537073080744L;
    @Column(name = "cod_pais", nullable = false, length = 2)
    private String codPais;

    @Column(name = "nivel", nullable = false, precision = 2)
    private BigDecimal nivel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        GenPaisEstructuraId entity = (GenPaisEstructuraId) o;
        return Objects.equals(this.codPais, entity.codPais) &&
                Objects.equals(this.nivel, entity.nivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPais, nivel);
    }

}