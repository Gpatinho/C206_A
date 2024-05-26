package organização.exemplo;

public class Main {
    public static void main(String[] args) {



        Usuario u1 = new Usuario("Patinho", "Patinho@inatel.br");
        Usuario u2 = new Usuario("Patolino", "Patolino@inatel.br");

        Facebook face1 = new Facebook("face159", 170);
        GooglePlus goo1 = new GooglePlus("google753", 50);
        Instagram insta1 = new Instagram("insta123", 200);
        Twitter tw1 = new Twitter("tw2648" , 170);

        u2.Usuario(face1);
        u1.Usuario(goo1);
        u1.Usuario(insta1);
        u1.Usuario(tw1);

        System.out.println("-------------------------------");
        System.out.println("Infromações do Usuário: ");
        System.out.println("Nome: " + u1.getNome());
        System.out.println("Email: " + u1.getEmail());

        System.out.println("-------------------------------");
        System.out.println("Infromações do Usuário: ");
        System.out.println("Nome: " + u2.getNome());
        System.out.println("Email: " + u2.getEmail());

        for (int i = 0 ; i < u1.redeSocial.length; i++){
            if (u1.redeSocial[i]!=null){
                if (u1.redeSocial[i] instanceof Facebook){
                    Facebook face = (Facebook) u1.redeSocial[i];
                    System.out.println("-------------------------------");
                    face.compartilhar();
                    face.fazStreaming();
                    face.postarVideo();
                } else if(u1.redeSocial[i] instanceof GooglePlus){
                    GooglePlus google = (GooglePlus) u1.redeSocial[i];
                    System.out.println("-------------------------------");
                    google.postarComentario();
                    google.postarFoto();
                    google.fazStreaming();
                }else if(u1.redeSocial[i] instanceof Instagram){
                    Instagram insta = (Instagram) u1.redeSocial[i];
                    System.out.println("-------------------------------");
                    insta.postarFoto();
                    insta.postarVideo();
                    insta.curtirPublicacao();
                }else if(u1.redeSocial[i] instanceof Twitter) {
                    Twitter tw = (Twitter) u1.redeSocial[i];
                    System.out.println("-------------------------------");
                    tw.curtirPublicacao();
                    tw.compartilhar();
                    tw.postarComentario();
                }

            }

        }
        for (int i = 0 ; i < u2.redeSocial.length; i++){
            if (u2.redeSocial[i]!=null){
                if (u2.redeSocial[i] instanceof Facebook){
                    Facebook face = (Facebook) u2.redeSocial[i];
                    System.out.println("-------------------------------");
                    face.compartilhar();
                    face.fazStreaming();
                    face.postarVideo();
                } else if(u2.redeSocial[i] instanceof GooglePlus){
                    GooglePlus google = (GooglePlus) u2.redeSocial[i];
                    System.out.println("-------------------------------");
                    google.postarComentario();
                    google.postarFoto();
                    google.fazStreaming();
                }else if(u2.redeSocial[i] instanceof Instagram){
                    Instagram insta = (Instagram) u2.redeSocial[i];
                    System.out.println("-------------------------------");
                    insta.postarFoto();
                    insta.postarVideo();
                    insta.curtirPublicacao();
                }else if(u2.redeSocial[i] instanceof Twitter) {
                    Twitter tw = (Twitter) u2.redeSocial[i];
                    System.out.println("-------------------------------");
                    tw.curtirPublicacao();
                    tw.compartilhar();
                    tw.postarComentario();
                }

            }

        }

    }
}