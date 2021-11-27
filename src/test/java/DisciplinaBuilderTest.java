import org.junit.Test;
import org.junit.jupiter.api.DisplayNameGenerator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class DisciplinaBuilderTest {

    private Date dataInvalida;
    private Date data;

    public DisciplinaBuilderTest() {
        try {
            dataInvalida = new SimpleDateFormat("yyyy-MM-dd").parse("2013-06-23");
            data = new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-23");
        } catch (ParseException e){}
    }
    @Test
    public void deveRetornarCodigoInvalido() {
        try {
            DisciplinaBuilder disciplinaBuilder = new DisciplinaBuilder();
            Disciplina disciplina = disciplinaBuilder
                    .setCodigo(-1)
                    .setNome("Aspectos em Eng soft")
                    .setDataInicio(data)
                    .setNumeroDeAlunos(30)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeInvalido() {
        try {
            DisciplinaBuilder disciplinaBuilder = new DisciplinaBuilder();
            Disciplina disciplina = disciplinaBuilder
                    .setCodigo(1)
                    .setNome("")
                    .setDataInicio(data)
                    .setNumeroDeAlunos(30)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome da Disciplina inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarDatainicioInválida() {
        try {
            DisciplinaBuilder disciplinaBuilder = new DisciplinaBuilder();
            Disciplina disciplina = disciplinaBuilder
                    .setCodigo(1)
                    .setNome("Teste")
                    .setDataInicio(dataInvalida)
                    .setNumeroDeAlunos(30)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data inválida", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNúmeroDeAlunosinválido() {
        try {
            DisciplinaBuilder disciplinaBuilder = new DisciplinaBuilder();
            Disciplina disciplina = disciplinaBuilder
                    .setCodigo(1)
                    .setNome("Teste")
                    .setDataInicio(data)
                    .setNumeroDeAlunos(-20)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de Alunos Total inválido", e.getMessage());
        }
    }
}