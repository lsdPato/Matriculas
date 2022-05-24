package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "per_familiar_persona")
public class PerFamiliarPersona {
    @EmbeddedId
    private PerFamiliarPersonaId id;

    @MapsId("codPersona")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_persona", nullable = false)
    private PerPersona codPersona;

    @Column(name = "tipo_familiar", nullable = false, length = 3)
    private String tipoFamiliar;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "tipo_identificacion", length = 3)
    private String tipoIdentificacion;

    @Column(name = "identificacion", length = 20)
    private String identificacion;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}