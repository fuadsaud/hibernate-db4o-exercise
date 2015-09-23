package br.unisinos.cc.bd2.ga1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.Collection;

/*
 * @author fuad, @date 8/27/15 12:43 AM
 */

@Entity
public class Grade implements java.io.Serializable {
    @Id
    private Long codigoGrade;

    private String nome;

    @OneToMany
    private Collection<Produto> produtos;

    @OneToMany
    private Collection<GradeItem> itens;
}
