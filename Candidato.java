public class Candidato {
    private String nome;
    private int idade;
    private String email;
    private double notaProva;


    public Candidato(String nome, int idade, String email, double notaProva) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.notaProva = notaProva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }

    public boolean isAprovado() {
        return this.notaProva >= 7.0;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", notaProva=" + notaProva +
                '}';
    }
}
