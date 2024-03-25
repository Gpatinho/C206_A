public class Computador {

    String nome;
    float preco;

    HardwareBasico[] hardwares = new HardwareBasico[3];
    SistemaOperacional so = new SistemaOperacional();

   MemoriaUSB musb;


    void mostraPCConfigs() {
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(so.nome);
        System.out.println(so.tipo);
/*
        for (int i = 0; i < hardwares.length; i++) {

            if(hardwares[i] != null ) {

                System.out.println(hardwares[i].nome);
                System.out.println(hardwares[i].capacidade);
            }
        }


 */
        for (HardwareBasico hardwares : hardwares){
            System.out.println(hardwares.nome);
            System.out.println(hardwares.capacidade);
        }

        if(musb != null ){
            System.out.println(musb.capacidade);
            System.out.println(musb.nome);
        }


    }
     void addMemoriaUSB(MemoriaUSB jorge){
        musb = jorge;

     }
}
