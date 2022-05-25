package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "gen_pais")
public class GenPai {
    @Id
    @Column(name = "cod_pais", nullable = false, length = 2)
    private String id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "por_omision", nullable = false, length = 1)
    private String porOmision;

    @Column(name = "codigo_telefonico", length = 3)
    private String codigoTelefonico;

    @Column(name = "nacionalidad", length = 50)
    private String nacionalidad;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

    public GenPai(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenPai)) return false;
        GenPai genPai = (GenPai) o;
        return Objects.equals(id, genPai.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}