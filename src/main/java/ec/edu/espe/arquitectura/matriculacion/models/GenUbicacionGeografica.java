package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "gen_ubicacion_geografica")
public class GenUbicacionGeografica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_ubicacion_geo_int", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_pais")
    private GenPai codPais;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_pais", referencedColumnName = "cod_pais", nullable = false),
            @JoinColumn(name = "nivel", referencedColumnName = "nivel", nullable = false)
    })
    private GenPaisEstructura genPaisEstructura;

    @Column(name = "cod_ubicacion_geografica", nullable = false, length = 20)
    private String codUbicacionGeografica;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_ubicacion_geo_padre")
    private GenUbicacionGeografica codUbicacionGeoPadre;

    @Column(name = "codigo_area_telefono", length = 4)
    private String codigoAreaTelefono;

    @Column(name = "codigo_alterno", length = 15)
    private String codigoAlterno;

    @Column(name = "codigo_postal", length = 15)
    private String codigoPostal;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    public GenUbicacionGeografica(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenUbicacionGeografica)) return false;
        GenUbicacionGeografica that = (GenUbicacionGeografica) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}