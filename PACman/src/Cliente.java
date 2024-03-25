public class Cliente {

    String nome;
    long cpf;

    float soma =0;

    Computador[] computador = new Computador[3];


    float calculaTotalCompra(){
        for (Computador computador : computador){
            soma = soma + computador.preco;
        }
        return  soma;

    }

}
