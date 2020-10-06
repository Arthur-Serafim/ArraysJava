/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

/**
 *
 * @author alunolab07
 */
public class UsaAgenda {
  public static void main(String[] args) {

    Agenda myAgenda = new Agenda();
    Contato dados = new Contato("27999728099", "arthur@dev.net.net", "Arthurzin", "Uma casa");

    myAgenda.inserir(dados);

    System.out.println(myAgenda.buscar("Arthurzin"));
  }
}
