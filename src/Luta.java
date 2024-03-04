import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private Boolean aprovado;
        
 

    
    public void  marcaLuta(Lutador lute1,Lutador lute2){
       if((lute1.getCategoria() == lute2.getCategoria()) && lute1 != lute2){
        this.aprovado = true;
        this.desafiante = lute2;
        this.desafiado = lute1;
          

       }else{
        this.aprovado=false;
        this.desafiado = null;
        this.desafiante = null;

        
        
       }
    
    }

    public void Lutar(){
     if(this.aprovado){
        System.out.println("LUTADOR1 : ");
        this.desafiante.apresentarLutador();
        System.out.println("LUTADOR2: ");
        this.desafiado.apresentarLutador();
        Random Acontecerluta = new Random();
        int FIGHT = Acontecerluta.nextInt(3);
        switch (FIGHT) {
            case 0: 
            System.out.println("Empatou");
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
            break;

             case 1:
             System.out.println("Ganhou: "+this.desafiado.getNome());
             this.desafiado.ganharLuta();
             this.desafiante.perdeLuta();
            break;

             case 2:
             System.out.println("Ganhou:"+this.desafiante.getNome());
             this.desafiante.ganharLuta();
             this.desafiado.perdeLuta();
            break;
        }
        
     }else{
        System.out.print("Não ocorreu luta");
     }
    }
    
    













    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public Boolean getAprovado() {
        return aprovado;
    }
    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }  
}   
