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
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "seg_usuario")
public class SegUsuario implements Serializable {
    @Id
    @Column(name = "cod_usuario", nullable = false, length = 30)
    private String id;

    @Column(name = "mail", nullable = false, length = 128)
    private String mail;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "telefono", length = 10)
    private String telefono;

    @Column(name = "clave", nullable = false, length = 64)
    private String clave;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "fecha_creacion", nullable = false)
    private Instant fechaCreacion;

    @Column(name = "origen", nullable = false, length = 3)
    private String origen;

    @Column(name = "fecha_cambio_clave")
    private LocalDate fechaCambioClave;

    @Column(name = "nro_intentos_fallidos", nullable = false, precision = 3)
    private BigDecimal nroIntentosFallidos;

    @Column(name = "fecha_ultima_sesion")
    private Instant fechaUltimaSesion;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    public SegUsuario(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SegUsuario)) return false;
        SegUsuario that = (SegUsuario) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}