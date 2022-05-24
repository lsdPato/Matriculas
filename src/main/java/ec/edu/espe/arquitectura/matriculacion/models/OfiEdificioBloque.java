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
@Table(name = "ofi_edificio_bloque")
public class OfiEdificioBloque {
    @Id
    @Column(name = "cod_edificio_bloque", nullable = false, length = 8)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_edificio")
    private OfiEdificio codEdificio;

    @Column(name = "nombre_bloque", nullable = false, length = 128)
    private String nombreBloque;

    @Column(name = "descripcion", length = 500)
    private String descripcion;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}