package br.unisinos.cc.bd2.ga1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

import java.util.Collection;

/*
 * @author fuad, @date 8/27/15 12:43 AM
 */

@Entity
public class Secao implements java.io.Serializable {
    @Id
    private Long codigoSecao;

    private String nome;

    @OneToMany
    private Collection<Categoria> categorias;

    @ManyToOne
    private Departamento departamento;
}
