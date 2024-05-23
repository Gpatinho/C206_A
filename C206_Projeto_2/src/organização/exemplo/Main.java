package organização.exemplo;

public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Patinho", "Patinho@inatel.br");

        organização.exemplo.Facebook face1 = new organização.exemplo.Facebook("face159", 150);
        organização.exemplo.GooglePlus goo1 = new organização.exemplo.GooglePlus("google753", 50);
        organização.exemplo.Instagram insta1 = new organização.exemplo.Instagram("insta123", 200);
        Twitter tw1 = new Twitter("tw2648" , 170);

        u1.Usuario(face1);
        u1.Usuario(goo1);
        u1.Usuario(insta1);
        u1.Usuario(tw1);

        System.out.println("-------------------------------");
        System.out.println("Infromações do Usuário: ");
        System.out.println("Nome: " + u1.getNome());
        System.out.println("Email: " + u1.getEmail());

        for (int i = 0 ; i < u1.redeSocial.length; i++){
            if (u1.redeSocial[i]!=null){
                if (u1.redeSocial[i] instanceof organização.exemplo.Facebook){
                    organização.exemplo.Facebook face = (organização.exemplo.Facebook) u1.redeSocial[i];
                    System.out.println("-------------------------------");
                    face.compartilhar();
                    face.fazStreaming();
                    face.postarVideo();
                } else if(u1.redeSocial[i] instanceof organização.exemplo.GooglePlus){
                    organização.exemplo.GooglePlus google = (organização.exemplo.GooglePlus) u1.redeSocial[i];
                    System.out.println("-------------------------------");
                    google.postarComentario();
                    google.postarFoto();
                    google.fazStreaming();
                }else if(u1.redeSocial[i] instanceof organização.exemplo.Instagram){
                    organização.exemplo.Instagram insta = (organização.exemplo.Instagram) u1.redeSocial[i];
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

    }
}