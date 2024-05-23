package organização.exemplo;

public class Facebook extends organização.exemplo.RedeSocial implements organização.exemplo.VideoConferencia, organização.exemplo.Compartilhamento {
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Usuário compartilhou uma publicação no Facebook!");
    }

    @Override
    public void postarFoto() {
        System.out.println("usuário postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Usuário postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Usuário comentou em uma publicação no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Usuário realizou uma Video-Conferência no Facebook!");
    }

    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println(" no Facebook!");
    }
}