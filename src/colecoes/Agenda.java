/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alunolab07
 */
public class Agenda {
  private Map<String, Contato> colecao = new HashMap<>();
  
  public void inserir(Contato dados) {
    colecao.put(dados.getApelido(), dados);
  }

  public Contato buscar (String nome) {
    return colecao.get(nome);
  }

  public void remover (String nome) {
    colecao.remove(nome);
  }

  public int quantidadeContatos() {
    return colecao.size();
  }
}
