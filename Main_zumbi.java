public class Main_zumbi {
    public static void main(String[] args){

        Zumbi p1 = new Zumbi();
        Zumbi p2 = new Zumbi();

        p1.vida = 100;
        p1.nome = "Roger";
        p2.vida = 99;
        p2.nome = "Jussara";

        System.out.println("Vida do zumbi p1: " + p1.vida);
        System.out.println("Vida do zumbi p2: " + p2.vida);

       if(p1.tranfereVida(p2, 30)){
           System.out.println("Vida do zumbi p1: " + p1.vida);
           System.out.println("Vida do zumbi p2: " + p2.vida);
       }

    }
}
