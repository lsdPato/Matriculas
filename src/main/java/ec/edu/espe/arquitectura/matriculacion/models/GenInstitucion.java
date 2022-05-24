package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "gen_institucion")
public class GenInstitucion {
    @Id
    @Column(name = "ruc", nullable = false, length = 13)
    private String id;

    @Column(name = "razon_social", nullable = false, length = 128)
    private String razonSocial;

    @Column(name = "nombre_comercial", nullable = false, length = 128)
    private String nombreComercial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_ubicacion_geo_int")
    private GenUbicacionGeografica codUbicacionGeoInt;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "dominio", nullable = false, length = 64)
    private String dominio;

    @Column(name = "url_info", length = 128)
    private String urlInfo;

    @Column(name = "url_sistema", nullable = false, length = 128)
    private String urlSistema;

    @Column(name = "version", nullable = false)
    private Integer version;

}