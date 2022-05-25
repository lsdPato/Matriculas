package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "seg_perfil_funcionalidad")
public class SegPerfilFuncionalidad implements Serializable {
    @EmbeddedId
    private SegPerfilFuncionalidadId id;

    @MapsId("codPerfil")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_perfil", nullable = false)
    private SegPerfil codPerfil;

    @MapsId("codFuncionalidad")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_funcionalidad", nullable = false)
    private SegFuncionalidad codFuncionalidad;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    public SegPerfilFuncionalidad(SegPerfilFuncionalidadId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SegPerfilFuncionalidad)) return false;
        SegPerfilFuncionalidad that = (SegPerfilFuncionalidad) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}