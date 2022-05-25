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
@Table(name = "seg_registro_sesion")
public class SegRegistroSesion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "secuencia", nullable = false)
    private Integer id;

    @Column(name = "cod_usuario", nullable = false, length = 32)
    private String codUsuario;

    @Column(name = "fecha_conexion", nullable = false)
    private Instant fechaConexion;

    @Column(name = "ip_conexion", nullable = false, length = 30)
    private String ipConexion;

    @Column(name = "resultado", nullable = false, length = 3)
    private String resultado;

    @Column(name = "error", length = 5)
    private String error;

    public SegRegistroSesion(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SegRegistroSesion)) return false;
        SegRegistroSesion that = (SegRegistroSesion) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}