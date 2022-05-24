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
public class SegUsuarioPerfilId implements Serializable {
    private static final long serialVersionUID = 2694045707049493610L;
    @Column(name = "cod_usuario", nullable = false, length = 30)
    private String codUsuario;

    @Column(name = "cod_perfil", nullable = false, length = 8)
    private String codPerfil;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SegUsuarioPerfilId entity = (SegUsuarioPerfilId) o;
        return Objects.equals(this.codUsuario, entity.codUsuario) &&
                Objects.equals(this.codPerfil, entity.codPerfil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codUsuario, codPerfil);
    }

}