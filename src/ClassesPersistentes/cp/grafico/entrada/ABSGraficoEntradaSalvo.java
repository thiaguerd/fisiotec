/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package cp.grafico.entrada;

import cp.grafico.ABSGraficoSalvo;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author Thiago-Asus
 */
public abstract class ABSGraficoEntradaSalvo extends ABSGraficoSalvo implements Serializable {

    private static final long serialVersionUID = 1L;

    public static ABSGraficoEntradaSalvo getInstance(){
        return new ABSGraficoEntradaSalvo() {private static final long serialVersionUID = 1L;};
    }
    
    @Override
    public String getAgrupamento() {
        return super.getAgrupamento();
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
    public Timestamp getDe() {
        return super.getDe();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getNome() {
        return super.getNome();
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
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
}
