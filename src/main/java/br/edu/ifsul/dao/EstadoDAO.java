package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Estado;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorgebavaresco@ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Stateful
public class EstadoDAO<TIPO> extends DAOGenerico<Estado> implements Serializable {
    
    public EstadoDAO(){
        super();
        classePersistente = Estado.class;
        // lista de ordenações possíveis
        listaOrdem.add(new Ordem("id", "ID", "="));
        listaOrdem.add(new Ordem("nome", "Nome", "like"));
        // ordem atual
        ordemAtual = listaOrdem.get(1);
        // inicializar o conversor de ordem com a lista de ordens
        converterOrdem = new ConverterOrdem();
        converterOrdem.setListaOrdem(listaOrdem);
    }

}
