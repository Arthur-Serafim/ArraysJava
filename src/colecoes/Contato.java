package colecoes;

public class Contato {
  private String numero;
  private String email;
  private String apelido;
  private String endereco;

  public Contato(String numero, String email, String apelido, String endereco) {
    this.numero = numero;
    this.email = email;
    this.apelido = apelido;
    this.endereco = endereco;
  }

  public String getNumero() {
    return this.numero;
  }

  public String getEmail() {
    return this.email;
  }

  public String getApelido() {
    return this.apelido;
  }

  public String getEndereco() {
    return this.endereco;
  }
}
