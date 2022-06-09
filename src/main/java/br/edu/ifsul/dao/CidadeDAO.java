package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Cidade;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorgebavaresco@ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Stateful
public class CidadeDAO<TIPO> extends DAOGenerico<Cidade> implements Serializable {
    
    public CidadeDAO(){
        super();
        classePersistente = Cidade.class;
        // lista de ordenações possíveis
        listaOrdem.add(new Ordem("id", "ID", "="));
        listaOrdem.add(new Ordem("nome", "Nome", "like"));        
        // criando uma ordem para filtrar as cidades do estado
        listaOrdem.add(new Ordem("estado.nome", "Estado", "like"));        
        // ordem atual
        ordemAtual = listaOrdem.get(1);
        // inicializar o conversor de ordem com a lista de ordens
        converterOrdem = new ConverterOrdem();
        converterOrdem.setListaOrdem(listaOrdem);        
    }

}
