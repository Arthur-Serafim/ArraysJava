/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author alunolab07
 */
public class Colecoes {
  public static void main(String[] args) {
    printArrayList();
    System.out.println("------------------------");
    printArray();
  }

  public static void printArrayList() {
    // Declara a variável
    ArrayList<ArrayList<String>> listaNomes = new ArrayList<ArrayList<String>>();

    ArrayList<String> firstArray = new ArrayList<String>();
    firstArray.add("Arthur");
    firstArray.add("Bianca");
    firstArray.add("Julio");

    ArrayList<String> secondArray = new ArrayList<String>();
    secondArray.add("Bruno");
    secondArray.add("Amanda");
    secondArray.add("Marcelo");

    ArrayList<String> thirdArray = new ArrayList<String>();
    thirdArray.add("Ricardo");
    thirdArray.add("Maria");
    thirdArray.add("Igor");


    // Designa valores
    listaNomes.add(firstArray);
    listaNomes.add(secondArray);
    listaNomes.add(thirdArray);

    listaNomes.forEach(item -> {
      System.out.println(item);
    });
  }

  public static void printArray() {
    String[][] listaNomes = new String [3][3];
    
    listaNomes[0][2] = "Arthur";
    listaNomes[0][1] = "Bianca";
    listaNomes[0][0] = "Julio";

    listaNomes[1][1] = "Bruno";
    listaNomes[1][0] = "Amanda";
    listaNomes[1][2] = "Marcelo";

    listaNomes[2][0] = "Ricardo";
    listaNomes[2][2] = "Maria";
    listaNomes[2][1] = "Igor";

    for (int i = 0; i <= 2; i++) {
      System.out.println(Arrays.toString(listaNomes[i]));
    }
  }
}
