package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "per_persona")
public class PerPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_persona", nullable = false)
    private Integer id;

    @Column(name = "codigo_alterno", nullable = false, length = 15)
    private String codigoAlterno;

    @Column(name = "tipo_identificacion", nullable = false, length = 3)
    private String tipoIdentificacion;

    @Column(name = "identificacion", nullable = false, length = 20)
    private String identificacion;

    @Column(name = "nombre1", nullable = false, length = 32)
    private String nombre1;

    @Column(name = "nombre2", length = 32)
    private String nombre2;

    @Column(name = "apellido1", nullable = false, length = 32)
    private String apellido1;

    @Column(name = "apellido2", length = 32)
    private String apellido2;

    @Column(name = "nombre_completo", nullable = false, length = 128)
    private String nombreCompleto;

    @Column(name = "nombre_comun", length = 64)
    private String nombreComun;

    @Column(name = "genero", nullable = false, length = 3)
    private String genero;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "nacionalidad", nullable = false)
    private GenPai nacionalidad;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_pais_nacimiento")
    private GenPai codPaisNacimiento;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lugar_nacimiento", nullable = false)
    private GenUbicacionGeografica lugarNacimiento;

    @Column(name = "estado_civil", nullable = false, length = 3)
    private String estadoCivil;

    @Column(name = "email", nullable = false, length = 128)
    private String email;

    @Column(name = "email_alterno", length = 128)
    private String emailAlterno;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "telefono_movil", length = 20)
    private String telefonoMovil;

    @Column(name = "extranjero", nullable = false, length = 1)
    private String extranjero;

    @Column(name = "requiere_representante", nullable = false, length = 1)
    private String requiereRepresentante;

    @Column(name = "discapacidad", nullable = false, length = 1)
    private String discapacidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_tipo_discapacidad")
    private PerTipoDiscapacidad codTipoDiscapacidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_tipo_persona")
    private PerTipoPersona codTipoPersona;

    @Column(name = "porcentaje_discapacidad", precision = 2)
    private BigDecimal porcentajeDiscapacidad;

    @Column(name = "carnet_conadis", length = 10)
    private String carnetConadis;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}