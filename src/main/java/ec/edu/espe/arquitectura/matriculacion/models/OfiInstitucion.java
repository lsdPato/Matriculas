package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "ofi_institucion")
public class OfiInstitucion {
    @Id
    @Column(name = "cod_institucion", nullable = false, precision = 3)
    private BigDecimal id;

    @Column(name = "ruc", nullable = false, length = 13)
    private String ruc;

    @Column(name = "razon_social", nullable = false, length = 250)
    private String razonSocial;

    @Column(name = "nombre_comercial", nullable = false, length = 250)
    private String nombreComercial;

    @Column(name = "dominio", length = 128)
    private String dominio;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    public OfiInstitucion(BigDecimal id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OfiInstitucion)) return false;
        OfiInstitucion that = (OfiInstitucion) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}