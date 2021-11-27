import java.util.Date;

public class Disciplina
{
    private int codigo;
    private String nome;
    private Date dataInicio;
    private int numeroDeAlunos;
    private String nomeProfessor;
    private String sala;

    public Disciplina() {
        this.nome = "";
        this.codigo = 0;
        this.dataInicio = null;
        this.numeroDeAlunos = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int código) {
        this.codigo = código;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getNumeroDeAlunos() {
        return numeroDeAlunos;
    }

    public void setNumeroDeAlunos(int numeroDeAlunos) {
        this.numeroDeAlunos = numeroDeAlunos;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

}