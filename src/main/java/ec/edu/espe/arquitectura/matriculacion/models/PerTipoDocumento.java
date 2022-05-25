package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "per_tipo_documento")
public class PerTipoDocumento implements Serializable {
    @Id
    @Column(name = "cod_tipo_documento", nullable = false, length = 16)
    private String id;

    @Column(name = "nombre", nullable = false, length = 64)
    private String nombre;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    public PerTipoDocumento(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerTipoDocumento)) return false;
        PerTipoDocumento that = (PerTipoDocumento) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}