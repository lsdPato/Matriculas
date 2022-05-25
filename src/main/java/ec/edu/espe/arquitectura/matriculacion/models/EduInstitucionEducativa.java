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
@Table(name = "edu_institucion_educativa")
public class EduInstitucionEducativa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_institucion_educativa", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tipo", nullable = false, length = 3)
    private String tipo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_ubicacion_geo_int", nullable = false)
    private GenUbicacionGeografica codUbicacionGeoInt;

    @Column(name = "direccion", nullable = false, length = 500)
    private String direccion;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EduInstitucionEducativa)) return false;
        EduInstitucionEducativa that = (EduInstitucionEducativa) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}