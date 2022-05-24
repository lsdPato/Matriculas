package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "gen_reglas")
public class GenRegla {
    @Id
    @Column(name = "cod_regla", nullable = false, length = 30)
    private String id;

    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "tipo", nullable = false, length = 3)
    private String tipo;

    @Column(name = "valor_numerico", precision = 5)
    private BigDecimal valorNumerico;

    @Column(name = "valor_texto", length = 50)
    private String valorTexto;

    @Column(name = "unidad", nullable = false, length = 100)
    private String unidad;

    @Column(name = "clasificacion", nullable = false, length = 3)
    private String clasificacion;

    @Column(name = "descripcion_detallada", length = 500)
    private String descripcionDetallada;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}