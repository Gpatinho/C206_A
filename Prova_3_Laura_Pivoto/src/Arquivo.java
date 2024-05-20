import java.io.*;
import java.util.ArrayList;

public class Arquivo{

    //Cconfigurando metodo de escrever o arquivo
    public void escrever (jogo jogo){

        //criando as estrutruas que permitiram a escrever os arquivos
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        //try catch para possíveis erros
        try{

            //Informamos o nome do arquivo onde queremos armazernar nossas informações
            os = new FileOutputStream("Jogos.txt",true);
            //Ponte que transforma de stream para caracteres para stream de bytes
            osw = new OutputStreamWriter(os);
            //Em bw escreveremos a informação que queremos salvar no nosso txt
            bw = new BufferedWriter(osw);

            //Escrevendo uma linha referência
            bw.write("--- Jogo ---");
            bw.newLine();
            //Pegando os dados dos jogos e escrevendo no arquivo
            bw.write(jogo.getNome() + "\n");
            bw.write(jogo.getPreco() + "\n");
            bw.write(jogo.getGenero() + "\n");


        }catch (Exception e){
            System.out.println("ERRO: " + e);
        }finally {
            try {
                bw.close();
            }catch (Exception e){}
        }

    }

    public ArrayList<jogo> ler(){

        //Classes básicas para realizar a leitura de dados de um arquivo
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        //Variável auxiliar para ler as informações
        String linhaLer;

        //Array que vai armazer os jogos encontrados no arquivo
        ArrayList<jogo> arrayJogos = new ArrayList<>();

        try{

            is = new FileInputStream("Jogos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine(); //Coloca o cursor no inicio do arquivo .txt

            //Enquanto tiver informações no .txt seguimos lendo as informações
            while (linhaLer != null){

                //Verificando se a string encontrou a flag
                if(linhaLer.contains("--- Jogo ---")){

                    //Variavel auxiliar de jogo, que servirá para salvar o Jogo no arquivo
                    jogo aux = new jogo();

                    //Preenchendo as informações do jogo
                    aux.setNome(br.readLine());
                    aux.setPreco(Integer.parseInt(br.readLine()));
                    aux.setGenero(br.readLine());

                    //Colocando o jogo no arraylist
                    arrayJogos.add(aux);
                }

                //Voltando a variável novamente ao inicio do arquivo
                linhaLer = br.readLine();
            }

        }catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        //Retornando o arraylist para a main
        return  arrayJogos;
    }
}