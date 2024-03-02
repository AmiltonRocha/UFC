public class Lutador {
  private  String nome;
  private  String nacionalidade;
  private  int idade;
  private  double altura;
  private  double peso;
  private  String categoria;
  private  int vitorias;
  private  int derrotas;
  private  int empates;
  
  
  public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias,
  int derrotas, int empates) {
    this.nome = nome;//this: e um indicador de variavel de parametro.
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;

}
public void apresentarLutador(){
 System.out.format("Nome do lutador %s\n Nacionalidade: %s\n Idade: %d\n Altura: %.2f\n Peso: %.2f\n Categoria: %s\n  Vitorias: %d\n Derrotas: %d\n Empates: %d\n",getNome(),getNacionalidade(),getIdade(),getAltura(),getPeso(),getCategoria(),getVitorias(),getDerrotas(),getEmpates());
}
    
    public String getNome() {
        return nome;
    }

public void setNome(String nome) {
  this.nome = nome;
}

public String getNacionalidade() {
  return nacionalidade;
}

public void setNacionalidade(String nacionalidade) {
  this.nacionalidade = nacionalidade;
}

public int getIdade() {
  return idade;
}

public void setIdade(int idade) {
  this.idade = idade;
}

public double getAltura() {
  return altura;
}

public void setAltura(double altura) {
  this.altura = altura;
}

public double getPeso() {
  return peso;
}

public void setPeso(double peso) {
  this.peso = peso;
}

public String getCategoria() {
  return setCategoria(categoria);
}

public String setCategoria(String categoria) {
  if(getPeso()>0 && getPeso()<=50){
    categoria = "leve";
  }if(getPeso()>50 && getPeso()<=80){
    categoria = "Media";
  }if(getPeso()>80 && getPeso()<=100){
    categoria = "Pesado";
  }if(getPeso()>100){
    categoria = "Mega Pesado";
  }return categoria;
}

public int getVitorias() {
  return vitorias;
}

public void setVitorias(int vitorias) {
  this.vitorias = vitorias;
}

public int getDerrotas() {
  return derrotas;
}

public void setDerrotas(int derrotas) {
  this.derrotas = derrotas;
}

public int getEmpates() {
  return empates;
}

public void setEmpates(int empates) {
  this.empates = empates;
}
}
