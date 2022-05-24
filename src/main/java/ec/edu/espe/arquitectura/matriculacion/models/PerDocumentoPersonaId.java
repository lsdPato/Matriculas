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
public class PerDocumentoPersonaId implements Serializable {
    private static final long serialVersionUID = -3247866499234054317L;
    @Column(name = "cod_persona", nullable = false)
    private Integer codPersona;

    @Column(name = "cod_tipo_documento", nullable = false, length = 16)
    private String codTipoDocumento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PerDocumentoPersonaId entity = (PerDocumentoPersonaId) o;
        return Objects.equals(this.codPersona, entity.codPersona) &&
                Objects.equals(this.codTipoDocumento, entity.codTipoDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPersona, codTipoDocumento);
    }

}