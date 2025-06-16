public abstrat class livro{
  private string titulo;
  private string autor.
  private int anopublicacao;
  private boolean disponivel;
}
livro(string titulo,string autor,int anopublicacao){
  this.titulo=titulo;
  this.autor=autor;
  this.anopublicacao=anopublicacao;
  this.disponivel=disponivel;
}
public string gettitulo (){
  return this.titulo;
    }
public string getautor (){
  return this.autor;
}
public int getanopublicacao(){
  public void settitulo(string titulo){
    this.titulo=titulo;
}
public void emprestar(){
  if(this.disonivel){
this.disponivel=false;
  sysrem.out.printhn("emprestado com sucesso");
  }else{
    system.out.println("livro isdisponive!");
}
} ublic void devolver(){
  if(!this.disponivel){
  this.disponivel=true;
  system.out.println("devolvido com sucesso!");
}else{  
  system.out.println("erro ao devolver");
}
}
public abstract void exiberdetalhes();
private arraylist<livro> listrasemprestadas;
[=new arraylist<>()]
  this.livrosemprestados=new arraylist<>();
public interface itembiblioteca{
  boolean estadoisdisponivel();
  package br.com.minhaclasse.contrato;
public interface itembiblioteca{
  boolean isdisponivel();
  void realizaremprestimo();
  string gettitlo();
}
package br.com.minhaclasse.modelo;
public abstract class livro{
  string titulo;
  private string autor;
  private in anopublicacao;
  private boolean disponivel;
  public livro (string titulo,string autor,int anopublicacao){
    this.titulo=titulo;
    this.autor=autor;
    this.anopublicacao=anopublicacao;
  }
  public boolean isdisponivel(){
    return disponivel:
      }
  packate br.com.minhaclasse.modelo
  import
  br.com.minhaclasse.contrato.itembiblioteca;
public class LivroFisico extend livro implementos itembiblioteca{
  public LivroFisico (string titulo, string autor, int anopublicacao, string localizacaopratileira){
    this.localizacaopratileira =
    localizacaopratileira;
    }
  pachage br.com.minhaclasse.modelo;
  import 
    br.com.minhaclasse.contrato.itembiblioteca;
  public class ebook extends livro implements itembiblioteca{
    private string formato;
    public ebook/string titulo, string autor, int anopublicacao,
    double tamanho,string formato){
      super/titulo,autor,anopublicacao,;
      this.formato=formato;
    }
    public void exibirdetalhes(){
      system.out.println("Ebook "+gettiulo();
    }
  }
  package br.com.minhaclasse.modelo;
  import java.util.arraylist;
  public class usuario {
  public string nome;
    public string idusuario;
    public (usuario (string nome,string id);{
      this.nome=nome;
      this.idusuario=id;
      }
    package br.com.minhaclasse.servico;
  import java.util.ArrayList;
  public class biblioteca{
    private string nome;
    public biblioteca{
      private string nome;
      public Biblioteca (string nome){
        import
        br.com.minhaclasse.servico.biblioteca;
    public class main{
      public static void main (string orgs){
        Biblioteca b=new
          Biblioteca (Biblioteca controle");
      }
    }
    
    
      
      
    
      
















  
