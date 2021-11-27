
import java.util.Date;
import java.util.Calendar;

public class DisciplinaBuilder {

    private Disciplina disciplina;
    Calendar calendar;

    public DisciplinaBuilder() {
        disciplina = new Disciplina();
        calendar = Calendar.getInstance();
    }

    public Disciplina build() {
        if (disciplina.getCodigo() < 1) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (disciplina.getNome().equals("")) {
            throw new IllegalArgumentException("Nome da Disciplina inválido");
        }
        if (disciplina.getDataInicio().before(calendar.getTime())) {
            throw new IllegalArgumentException("Data inválida");
        }
        if (disciplina.getNumeroDeAlunos() < 1) {
            throw new IllegalArgumentException("Número de Alunos Total inválido");
        }
        return disciplina;
    }

    public DisciplinaBuilder setCodigo(int codigo) {
        disciplina.setCodigo(codigo);
        return this;
    }

    public DisciplinaBuilder setNome(String nome) {
        disciplina.setNome(nome);
        return this;
    }

    public DisciplinaBuilder setDataInicio(Date dataInicio) {
        disciplina.setDataInicio(dataInicio);
        return this;
    }

    public DisciplinaBuilder setNumeroDeAlunos(int numeroDeAlunos) {
        disciplina.setNumeroDeAlunos(numeroDeAlunos);
        return this;
    }

    public DisciplinaBuilder setNomeProfessor(String nomeProfessor) {
        disciplina.setNomeProfessor(nomeProfessor);
        return this;
    }

    public DisciplinaBuilder setSala(String sala) {
        disciplina.setSala(sala);
        return this;
    }
}
