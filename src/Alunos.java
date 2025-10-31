public class Alunos extends Pessoas{

    String nome;
    double nota1;
    double nota2;
    double nota3;

    public Alunos(String nome) {
        super(nome);
    }


    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }}
