package br.unisinos.cc.bd2.ga1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;

import java.util.Collection;

/*
 * @author fuad, @date 8/27/15 12:43 AM
 */

@Entity
public class Departamento implements java.io.Serializable {
    @Id
    private Long codigoDepartamento;

    private String nome;

    @OneToMany
    private Collection<Secao> secoes;

    @ManyToMany
    private Collection<Loja> lojas;
}
