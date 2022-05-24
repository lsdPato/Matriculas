package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "ofi_sede")
public class OfiSede {
    @Id
    @Column(name = "cod_sede", nullable = false, length = 8)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_institucion")
    private OfiInstitucion codInstitucion;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "direccion", length = 10)
    private String direccion;

    @Column(name = "es_principal", nullable = false, length = 1)
    private String esPrincipal;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}