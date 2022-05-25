package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "per_documento_persona")
public class PerDocumentoPersona implements Serializable {
    @EmbeddedId
    private PerDocumentoPersonaId id;

    @MapsId("codPersona")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_persona", nullable = false)
    private PerPersona codPersona;

    @MapsId("codTipoDocumento")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_tipo_documento", nullable = false)
    private PerTipoDocumento codTipoDocumento;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "fecha_registro", nullable = false)
    private Instant fechaRegistro;

    @Column(name = "archivado", length = 1)
    private String archivado;

    @Column(name = "fecha_emision")
    private LocalDate fechaEmision;

    @Column(name = "fecha_caducidad")
    private LocalDate fechaCaducidad;

    @Column(name = "digitalizado", length = 1)
    private String digitalizado;

    @Column(name = "url")
    private String url;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    public PerDocumentoPersona(PerDocumentoPersonaId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerDocumentoPersona)) return false;
        PerDocumentoPersona that = (PerDocumentoPersona) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}