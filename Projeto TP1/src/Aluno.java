public class Aluno {
    // Atributos
    private String nome;
    private int idade;
    private String curso;
    private double mediaNotas;

    // Construtor
    public Aluno(String nome, int idade, String curso, double mediaNotas) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.mediaNotas = mediaNotas;
    }

    // Métodos de Acesso (Getters e Setters)
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    // Método para Retornar Situação do Aluno
    public String verificarSituacao() {
        if (mediaNotas >= 7.0) {
            return "Aprovado";
        } else if (mediaNotas >= 4.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    // Método Principal para Testar a Classe
    public static void main(String[] args) {
        // Instanciando um objeto Aluno
        Aluno aluno1 = new Aluno("João", 20, "Engenharia", 8.5);

        // Imprimindo informações do aluno
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Média de Notas: " + aluno1.getMediaNotas());
        System.out.println("Situação: " + aluno1.verificarSituacao());
    }
}
