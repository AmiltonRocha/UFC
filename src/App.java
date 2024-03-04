public class App {
    public static void main(String[] args) throws Exception {
    Lutador L[]= new Lutador[2];
    L[0]  = new Lutador("Jose", "Brasileira", 25, 1.75, 110, 20, 0, 5);
    L[1] = new Lutador("Tiago", "Brasileira", 25, 1.75, 110, 20, 0, 5);
         
    L[1].apresentarLutador(); 

    Luta Comecar = new Luta();
    Comecar.marcaLuta(L[0],L[1]);

    Comecar.Lutar();

       
       
       
    }
}

