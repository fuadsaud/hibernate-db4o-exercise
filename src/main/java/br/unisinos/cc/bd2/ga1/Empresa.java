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
public class Empresa implements java.io.Serializable {
    @Id
    private Long codigoEmpresa;

    private String razaoSocial;
    private String fantasia;
    private String logradouro;

    @OneToMany
    private Collection<Loja> lojas;

    @ManyToOne
    private Holding holding;
}
