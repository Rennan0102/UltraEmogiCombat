package ultraemogicombat;

public class Lutador{
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    public Lutador(String nome, String nacionalidade,int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
        if (this.peso < 52.2f){this.categoria = "Inválido";}
        else if (this.peso <= 70.3f){this.categoria = "Leve";}
        else if (this.peso <= 83.9f){this.categoria = "Médio";}
        else if (this.peso <= 120.2f){this.categoria = "Pesado";}
        else {this.categoria = "Inválido";}
    }  // Fim do Construtor
    
    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Com " + getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando: " + getPeso() + " kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }  // Fim do Método apresentar
    
    public void status(){
        System.out.println(getNome() + " é um peso " + getCategoria() + " com");
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }  // Fim do Método status
    
    public void ganharLuta(){
        this.vitorias++;
    }  // Fim do Método ganharLuta
    
    public void perderLuta(){
        this.derrotas++;
    }  // Fim do Método perderLuta
    
    public void empatarLuta(){
        this.empates++;
    }  // Fim do Método empatarLuta

    
    // Métodos Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria(){
        return categoria;
    }
    private void setCategoria(){
        if (this.peso < 52.2f){this.categoria = "Inválido";}
        else if (this.peso <= 70.3f){this.categoria = "Leve";}
        else if (this.peso <= 83.9f){this.categoria = "Médio";}
        else if (this.peso <= 120.2f){this.categoria = "Pesado";}
        else {this.categoria = "Inválido";}
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }

    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
}
