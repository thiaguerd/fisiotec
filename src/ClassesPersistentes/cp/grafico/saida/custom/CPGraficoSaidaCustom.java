/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.grafico.saida.custom;

import cp.grafico.InterfaceGraficoCustom;
import cp.grafico.saida.ABSGraficoSaidaSalvo;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.envers.Audited;

/**
 *
 * @author Thiago-Asus
 */
@Audited
@Entity
public class CPGraficoSaidaCustom extends ABSGraficoSaidaSalvo implements Serializable, InterfaceGraficoCustom {

    private static final long serialVersionUID = 1L;

    //GET'S
    @Id
    @GeneratedValue
    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public Timestamp getDe() {
        return super.getDe();
    }

    @Override
    public Timestamp getAte() {
        return super.getAte();
    }

    @Override
    public Timestamp getDataModificado() {
        return super.getDataModificado();
    }

    @Override
    public String getAgrupamento() {
        return super.getAgrupamento();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    //SET'S
    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public void setAgrupamento(String agrupamento) {
        super.setAgrupamento(agrupamento);
    }

    @Override
    public void setAte(Timestamp ate) {
        super.setAte(ate);
    }

    @Override
    public void setDataModificado(Timestamp dataModificado) {
        super.setDataModificado(dataModificado);
    }

    @Override
    public void setDe(Timestamp de) {
        super.setDe(de);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
}
