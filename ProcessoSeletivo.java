import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    private List<Candidato> candidatos;

    public ProcessoSeletivo() {
        this.candidatos = new ArrayList<>();
    }

    public void adicionarCandidato(Candidato candidato) {
        this.candidatos.add(candidato);
    }

    public void listarCandidatos() {
        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
        }
    }

    public void listarAprovados() {
        for (Candidato candidato : candidatos) {
            if (candidato.isAprovado()) {
                System.out.println(candidato);
            }
        }
    }

    public boolean verificarAprovacao(String email) {
        for (Candidato candidato : candidatos) {
            if (candidato.getEmail().equals(email)) {
                return candidato.isAprovado();
            }
        }
        return false;
    }
}
