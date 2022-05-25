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
@Table(name = "per_hist_tipo_persona")
public class PerHistTipoPersona implements Serializable {
    @EmbeddedId
    private PerHistTipoPersonaId id;

    @MapsId("codPersona")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_persona", nullable = false)
    private PerPersona codPersona;

    @MapsId("codTipoPersona")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_tipo_persona", nullable = false)
    private PerTipoPersona codTipoPersona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_institucion_educativa")
    private EduInstitucionEducativa codInstitucionEducativa;

    @Column(name = "fecha_inicio", nullable = false)
    private Instant fechaInicio;

    @Column(name = "cod_usuario_ini", nullable = false, length = 30)
    private String codUsuarioIni;

    @Column(name = "fecha_fin")
    private Instant fechaFin;

    @Column(name = "cod_usuario_fin", length = 30)
    private String codUsuarioFin;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    public PerHistTipoPersona(PerHistTipoPersonaId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerHistTipoPersona)) return false;
        PerHistTipoPersona that = (PerHistTipoPersona) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}