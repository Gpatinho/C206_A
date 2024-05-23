package organização.exemplo;

public class Usuario {
    private String nome;
    private String email;
    RedeSocial[] redeSocial =  new RedeSocial[20];

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void Usuario(Twitter redeSociais){
        for( int i = 0; i < redeSocial.length; i++){
            if(redeSocial[i] == null){
                redeSocial[i] = redeSociais;
                if(redeSocial[i] instanceof Facebook){
                    System.out.println("O usuário tem uma conta no Facebook!");
                    break;
                }else if (redeSocial[i] instanceof GooglePlus){
                    System.out.println("O usuário tem uma conta no GooglePlus!");
                    break;
                }else if (redeSocial[i] instanceof Instagram){
                    System.out.println("O usuário tem uma conta no Instagram!");
                    break;
                }else if (redeSocial[i] instanceof Twitter){
                    System.out.println("O usuário tem uma conta no Twitter!");
                    break;
                }

                break;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Usuario(Facebook face1) {
    }

    public void Usuario(Instagram insta1) {
    }

    public void Usuario(GooglePlus goo1) {
    }
}