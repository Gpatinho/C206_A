import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// Scanner para leitura de dados
        Boolean flag = true; //Flag para o menu
        Arquivo arquivo = new Arquivo(); //Criando o arquivo
        ArrayList<jogo> jogosArray = new ArrayList<>(); //ArrayList do jogo

        while (flag) {
            //Configurando as opções do menu
            System.out.println("--- MENU ---");
            System.out.println("1 - Adicionar um novo Jogo ");
            System.out.println("2 - Mostrar informações do Arquivo");
            System.out.println("3 - Ordenar jogo em ordem decrescente em relação ao preco");
            System.out.println("4 - Mostrar a quantidade de jogos por genero");
            System.out.println("5 - Sair do Menu");

            //Operador do Menu
            int op = sc.nextInt();
            sc.nextLine(); // Para quebrar a linha e poder entrar com String sem problemas
            switch (op) {

                case 1: //Adicionando um novo Jogo no arquivo
                    System.out.println("--- Adicionando jogo ---");

                    //Entrando com o nome do jogo
                    System.out.print("Entre com o nome do jogo: ");
                    String nome = sc.nextLine();

                    try {
                        // Entrando com a posicação do jogador
                        System.out.print("Entre com o genero do jogo: ");
                        String genero = sc.nextLine();

                        //Verifiando se o genero é valida
                        if (genero.equals("Guerra") || genero.equals("Futebol") || genero.equals("RPG")) {
                            //Se for válida, continua o código normalmente
                        } else {
                            throw new InfoInvalidaException("genero inválida!");
                            //Inválido, ativa a exception que para a execução dessa parte, voltando para o menu
                        }

                        try {
                            //Entrando com o preco do jogo
                            System.out.print("Entre com o preco do jogo: ");
                            int game = sc.nextInt();
                            // verificação o preco do game
                            if (game > 0) {
                                //Se for válido, continua o código normalmente
                            } else {
                                throw new InfoInvalidaException("Jogo precisa ter um game com preco maior de 0");
                                //Inválido, ativa a exception que para a execução dessa parte, voltando para o menu
                            }

                            //Criando o Jogo, escrevendo no arquivo e adicionando ao Array
                            jogo j1 = new jogo(nome, game, genero); // objeto do jogo pegando as variáveis auxiliares criadas ao longo do case 1
                            arquivo.escrever(j1);
                            System.out.println("Jogo adicionado com sucesso!");

                        } catch (InfoInvalidaException e){
                            System.out.println("preco do game inválida! Tente novamente!");
                            break;
                        }

                    } catch (InfoInvalidaException e) {
                        System.out.println("genero inválida! Tente novamente!");
                        break;
                    }
                    break;

                case 2: // Mostrando as informações do arquivo(.txt)
                    //Lendo o arquivo e adicionando no array de leitura
                    jogosArray = arquivo.ler();
                    //Mostrando os dados do arquivo de acordo com a ordem que foram adicionados
                    System.out.println("--- Lista de Jogos ---");
                    for (int i = 0; i < jogosArray.size(); i++) {
                        System.out.println("Nome do jogo: " + jogosArray.get(i).getNome());
                        System.out.println("Genero do jogo: " + jogosArray.get(i).getGenero());
                        System.out.println("Preco do jogo: " + jogosArray.get(i).getPreco());
                        System.out.println("-------------------");
                    }
                    break;
                case 3: //Ordenação descresente dos jogos
                    // faz a ordenação dos jogos e na classe Jogo faz a ordenação descresente usando o compareTo com o preco do game
                    Collections.sort(jogosArray);
                    //Mostrando os dados do arquivo em ordem descresente
                    System.out.println("--- Lista de Jogos ---");
                    for (int i = 0; i < jogosArray.size(); i++) {
                        System.out.println("Nome do jogo: " + jogosArray.get(i).getNome());
                        System.out.println("Posição do jogo: " + jogosArray.get(i).getGenero());
                        System.out.println("game do jogo: " + jogosArray.get(i).getPreco());
                        System.out.println("-------------------");
                    }
                    break;
                case 4: //Quantidade de jogos por genero
                    // variáveis para contagem de jogos por genero
                    int Guerra = 0, Futebol = 0, RPG = 0;

                    for (int i = 0; i < jogosArray.size(); i++) {
                        // verificação de cada genero dos jogos dentro do array, e incrementação na variavél contadora responsável
                        if(jogosArray.get(i).getGenero().equals("Guerra")){
                            Guerra++;
                        }
                        if(jogosArray.get(i).getGenero().equals("Futebol")){
                            Futebol++;
                        }
                        if(jogosArray.get(i).getGenero().equals("RPG")){
                            RPG++;
                        }
                    }

                    // Mostrar a variável contadora de cada genero
                    System.out.println("-------------------");
                    System.out.println("O jogo tem " + Guerra + " guerras!");
                    System.out.println("O jogo tem " + Futebol + " futebols!");
                    System.out.println("O jogo tem " + RPG + " rpgs!");
                    System.out.println("-------------------");

                    break;
                case 5: // Sair do menu
                    //Opção de sair do menu, finalizando o código
                    flag = false;
                    break;
                default: //Default padrão
                    System.out.println("Entre com uma opção válida de menu!");
                    break;
            }

        }

    }
}