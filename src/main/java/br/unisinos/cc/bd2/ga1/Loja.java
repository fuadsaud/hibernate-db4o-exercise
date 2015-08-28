package br.unisinos.cc.bd2.ga1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;

import java.util.Collection;
import java.util.Date;

/*
 * @author fuad, @date 8/27/15 12:43 AM
 */

@Entity
public class Loja implements java.io.Serializable {
    @Id
    private Long codigoLoja;

    private String nome;
    private Date dataAbertura;
    private Integer nroFuncionario;

    @ManyToOne
    private Empresa empresa;

    @ManyToMany
    private Collection<Departamento> departamentos;
}
