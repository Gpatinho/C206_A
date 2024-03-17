public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
    return this.vida;

   }
   boolean tranfereVida(Zumbi zumbiAlvo, double quantidade){

  if (this.vida > quantidade){
      vida -= quantidade;

      zumbiAlvo.vida += quantidade;

      return true;
  }
     else {
      System.out.println("Não é possivel");
      return false;
  }

   }
}
