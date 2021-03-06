/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.grafico.entradasaida.custom;

import cp.estoque.CPProduto;
import cp.grafico.ABSGraficoSalvo;
import cp.grafico.InterfaceGraficoCustom;
import cp.grafico.entradasaida.ABSGraficoEntradaSaida;
import cp.grafico.entradasaida.ABSGraficoEntradaSaidaProdutos;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.envers.Audited;

/**
 *
 * @author Thiago-Asus
 */
@Audited
@Entity
public class CPGraficoEntradaSaidaCustomProdutos extends ABSGraficoEntradaSaidaProdutos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Override
    public long getId() {
        return super.getId();
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade(CascadeType.MERGE)
    @Override
    public CPGraficoEntradaSaidaCustom getGrafico() {
        return (CPGraficoEntradaSaidaCustom) super.getGrafico();
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade(CascadeType.MERGE)
    @Override
    public CPProduto getProduto() {
        return super.getProduto();
    }

    @Override
    public void setGrafico(ABSGraficoSalvo grafico) {
        super.setGrafico(grafico);
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public void setProduto(CPProduto produto) {
        super.setProduto(produto);
    }

}
