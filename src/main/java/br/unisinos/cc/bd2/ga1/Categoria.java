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
public class Categoria implements java.io.Serializable {
    @Id
    private Long codigoCategoria;

    @OneToMany
    private Collection<Produto> produtos;

    @ManyToOne
    private Secao secao;
}
