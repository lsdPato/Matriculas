package ec.edu.espe.arquitectura.matriculacion.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edu_prerequisito")
public class EduPrerequisito {
    @Id
    @Column(name = "cod_prerequisito", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_materia_padre", nullable = false)
    private EduMateria codMateriaPadre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "edu_cod_materia", nullable = false)
    private EduMateria eduCodMateria;

    @Column(name = "agrupacion_prerequisitos", nullable = false)
    private Integer agrupacionPrerequisitos;

}