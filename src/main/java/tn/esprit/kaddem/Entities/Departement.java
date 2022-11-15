package tn.esprit.kaddem.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "idDepart")
    private long idDepart;
    private String nomDepartement;
    @OneToMany(mappedBy = "departement")
    //@JsonIgnore
    private Set<Etudiant> etudiants;
}