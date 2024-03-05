import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testVerificarSituacaoAprovado() {
        Aluno aluno = new Aluno("João", 20, "Engenharia", 8.5);
        assertEquals("Aprovado", aluno.verificarSituacao());
    }

    @Test
    public void testVerificarSituacaoRecuperacao() {
        Aluno aluno = new Aluno("Maria", 22, "Matemática", 5.0);
        assertEquals("Recuperação", aluno.verificarSituacao());
    }

    @Test
    public void testVerificarSituacaoReprovado() {
        Aluno aluno = new Aluno("Pedro", 21, "Física", 3.5);
        assertEquals("Reprovado", aluno.verificarSituacao());
    }

    @Test
    public void testVerificarSituacaoLimiteSuperiorAprovado() {
        Aluno aluno = new Aluno("Ana", 19, "História", 7.0);
        assertEquals("Aprovado", aluno.verificarSituacao());
    }

    @Test
    public void testVerificarSituacaoLimiteInferiorRecuperacao() {
        Aluno aluno = new Aluno("Carlos", 23, "Letras", 4.0);
        assertEquals("Recuperação", aluno.verificarSituacao());
    }

    @Test
    public void testVerificarSituacaoLimiteInferiorReprovado() {
        Aluno aluno = new Aluno("Mariana", 20, "Química", 0.0);
        assertEquals("Reprovado", aluno.verificarSituacao());
    }
}
