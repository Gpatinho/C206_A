package organização.exemplo;

public class GooglePlus extends organização.exemplo.RedeSocial implements organização.exemplo.VideoConferencia, organização.exemplo.Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Usuário compartilhou uma publicação no Google Plus!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Usuário postou uma foto no Google Plus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Usuário postou um vídeo no Google Plus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Usuário comentou em uma publicação no Google Plus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Usuário realizou uma vídeo-conferência no Google Plus!");
    }

    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println(" no Google Plus!");
    }
}