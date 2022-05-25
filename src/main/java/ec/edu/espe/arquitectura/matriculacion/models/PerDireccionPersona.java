package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "per_direccion_persona")
public class PerDireccionPersona implements Serializable {
    @EmbeddedId
    private PerDireccionPersonaId id;

    @MapsId("codPersona")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_persona", nullable = false)
    private PerPersona codPersona;

    @Column(name = "cod_tipo_direccion", nullable = false, length = 3)
    private String codTipoDireccion;

    @Column(name = "cod_org_geo_direccion", nullable = false, precision = 8)
    private BigDecimal codOrgGeoDireccion;

    @Column(name = "calle_principal", nullable = false, length = 100)
    private String callePrincipal;

    @Column(name = "numeracion", nullable = false, length = 15)
    private String numeracion;

    @Column(name = "calle_secundaria", length = 100)
    private String calleSecundaria;

    @Column(name = "direccion_adicional", length = 50)
    private String direccionAdicional;

    @Column(name = "barrio", length = 100)
    private String barrio;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Column(name = "principal", nullable = false, length = 1)
    private String principal;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    public PerDireccionPersona(PerDireccionPersonaId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerDireccionPersona)) return false;
        PerDireccionPersona that = (PerDireccionPersona) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}