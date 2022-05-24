package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "ofi_aula")
public class OfiAula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_aula", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_tipo_aula")
    private OfiTipoAula codTipoAula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_edificio_bloque")
    private OfiEdificioBloque codEdificioBloque;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_edificio")
    private OfiEdificio codEdificio;

    @Column(name = "cod_alterno", nullable = false, length = 10)
    private String codAlterno;

    @Column(name = "capacidad", nullable = false, precision = 4)
    private BigDecimal capacidad;

    @Column(name = "piso", nullable = false, precision = 2)
    private BigDecimal piso;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}