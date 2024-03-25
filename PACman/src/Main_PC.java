import java.util.Scanner;

public class Main_PC {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.nome =" Annacrenno";
        cliente1.cpf = 111111;

        Scanner patinho = new Scanner(System.in);

        int cod = patinho.nextInt();

        Computador c1 = new Computador();
        HardwareBasico h1 = new HardwareBasico();
        HardwareBasico h2 = new HardwareBasico();
        HardwareBasico h3 = new HardwareBasico();

        MemoriaUSB m1 = new MemoriaUSB();

        Computador c2 = new Computador();
        HardwareBasico h4 = new HardwareBasico();
        HardwareBasico h5 = new HardwareBasico();
        HardwareBasico h6 = new HardwareBasico();

        MemoriaUSB m2 = new MemoriaUSB();


        Computador c3 = new Computador();
        HardwareBasico h7 = new HardwareBasico();
        HardwareBasico h8 = new HardwareBasico();
        HardwareBasico h9 = new HardwareBasico();

        MemoriaUSB m3 = new MemoriaUSB();

        c1.nome = "Positivo ";
        c1.preco = 3300;
        h1.nome = "Pentium Core i3 ";
        h1.capacidade = 2200;
        c1.hardwares[0] = h1;
        h2.nome = "Gb de Memória RAM ";
        h2.capacidade = 8;
        c1.hardwares[1] = h2;
        h3.nome = "GB de HD";
        h3.capacidade = 500;
        c1.hardwares[2] = h3;
        c1.so.nome = "Linux Ubuntu ";
        c1.so.tipo = 32;
        m1.nome = "Pen-Drive ";
        m1.capacidade = 16;

        c1.addMemoriaUSB(m1);


        c2.nome = " Acer ";
        c2.preco = 8800;
        h4.nome = " Pentium Core i5 ";
        h4.capacidade = 3370;
        c2.hardwares[0] = h4;
        h5.nome = " Memoria RAM ";
        h5.capacidade = 16;
        c2.hardwares[1] = h5;
        h6.nome = " TB de HD";
        h6.capacidade = 1;
        c2.hardwares[2] = h6;
        c2.so.nome = " Windows 8 ";
        c2.so.tipo = 64;
        m2.nome = " Pen-Drive ";
        m2.capacidade = 32;

        c2.addMemoriaUSB(m2);

        c3.nome = " Vaio ";
        c3.preco = 4800;
        h7.nome = " Pentium Core i7 ";
        h7.capacidade = 4500;
        c3.hardwares[0] = h7;
        h8.nome = " Gb de Memória RAM";
        h8.capacidade = 32;
        c3.hardwares[1] = h8;
        h9.nome = " TB de HD";
        h9.capacidade = 2;
        c3.hardwares[2] = h9;
        c3.so.nome = " Windows 10 ";
        c3.so.tipo = 64;
        m3.nome = " HD Externo TB ";
        m3.capacidade = 1;

        c3.addMemoriaUSB(m1);

        while (cod != 0) {


            if (cod == 1) {
                for (int i = 0; i < cliente1.computador.length; i++) {
                    if (cliente1.computador[i] == null) {
                        cliente1.computador[i] = c1;
                        break;
                    }

                }
                System.out.println("Adicionado ao carrinho");

            }
            if (cod == 2) {
                for (int i = 0; i < cliente1.computador.length; i++) {
                    if (cliente1.computador[i] == null) {
                        cliente1.computador[i] = c2;
                        break;
                    }

                }
                System.out.println("Adicionado ao carrinho");

            }
            if (cod == 3) {
                for (int i = 0; i < cliente1.computador.length; i++) {
                    if (cliente1.computador[i] == null) {
                        cliente1.computador[i] = c3;
                        break;
                    }

                }
                System.out.println("Adicionado ao carrinho");

            }

            cod = patinho.nextInt();

        }
        System.out.println("Compra efetivada");

        System.out.println(cliente1.nome);
        System.out.println(cliente1.cpf);
        for (int i = 0; i < cliente1.computador.length ; i++) {
          if(cliente1.computador[i] != null){
              cliente1.computador[i].mostraPCConfigs();
          }
        }
                System.out.println(cliente1.calculaTotalCompra());
    }
}
