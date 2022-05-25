package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "seg_modulo")
public class SegModulo implements Serializable {
    @Id
    @Column(name = "cod_modulo", nullable = false, length = 16)
    private String id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "version", nullable = false)
    private Integer version;

    public SegModulo(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SegModulo)) return false;
        SegModulo segModulo = (SegModulo) o;
        return id.equals(segModulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}