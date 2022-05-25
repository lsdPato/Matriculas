package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edu_calificacion")
public class EduCalificacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_calificacion", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_inscripcion", nullable = false)
    private EduMatricula codInscripcion;

    @Column(name = "nota1", precision = 5, scale = 2)
    private BigDecimal nota1;

    @Column(name = "nota2", precision = 5, scale = 2)
    private BigDecimal nota2;

    @Column(name = "nota3", precision = 5, scale = 2)
    private BigDecimal nota3;

    @Column(name = "nota4", precision = 5, scale = 2)
    private BigDecimal nota4;

    @Column(name = "nota5", precision = 5, scale = 2)
    private BigDecimal nota5;

    @Column(name = "nota6", precision = 5, scale = 2)
    private BigDecimal nota6;

    @Column(name = "nota7", precision = 5, scale = 2)
    private BigDecimal nota7;

    @Column(name = "nota8", precision = 5, scale = 2)
    private BigDecimal nota8;

    @Column(name = "nota9", precision = 5, scale = 2)
    private BigDecimal nota9;

    @Column(name = "nota10", precision = 5, scale = 2)
    private BigDecimal nota10;

    @Column(name = "promedio", precision = 5, scale = 2)
    private BigDecimal promedio;

    @Column(name = "estado", length = 3)
    private String estado;

    @Column(name = "observacion", length = 25)
    private String observacion;

    public EduCalificacion(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EduCalificacion)) return false;
        EduCalificacion that = (EduCalificacion) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}