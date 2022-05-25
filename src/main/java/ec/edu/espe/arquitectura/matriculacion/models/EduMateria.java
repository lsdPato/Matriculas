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
@Table(name = "edu_materia")
public class EduMateria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_materia", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_departamento", nullable = false)
    private EduDepartamento codDepartamento;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "creditos", nullable = false, precision = 4, scale = 2)
    private BigDecimal creditos;

    @Column(name = "horas", nullable = false, precision = 4, scale = 2)
    private BigDecimal horas;

    @Column(name = "ponderacion", nullable = false, precision = 5, scale = 2)
    private BigDecimal ponderacion;

    public EduMateria(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EduMateria)) return false;
        EduMateria that = (EduMateria) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}