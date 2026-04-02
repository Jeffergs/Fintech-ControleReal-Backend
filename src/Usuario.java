public class Usuario {
    private static int contador = 0;
    private int id;
    private String nome;
    private String sobrenome;
    private char genero;
    private String email;
    private String senha;

    public Usuario(String nome, String sobrenome, char genero, String email, String senha) {
        this.id = contador++;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.email = email;
        this.senha = senha;
    }


}
