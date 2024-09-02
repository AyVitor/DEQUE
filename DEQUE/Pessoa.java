package POO.DEQUE;

public class Pessoa {
    private int id;
    private String sexo;
    private int idade;
    private boolean gestante;
    private boolean lactante;
    private boolean necessidadesEspeciais;
    private int prioridade;

   
    public Pessoa(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadesEspeciais) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadesEspeciais = necessidadesEspeciais;
        this.prioridade = determinarPrioridade();
    }


    private int determinarPrioridade() {
        if (gestante || lactante) {
            return 3;
        } else if (necessidadesEspeciais) {
            return 2;
        } else if (idade > 60) {
            return 1;
        } else {
            return 0;
        }
    }
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public String getSexo() {
    return sexo;
}
public void setSexo(String sexo) {
    this.sexo = sexo;
}
    // Getters para atributos
    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Idade: " + idade + ", Sexo: " + sexo + ", Prioridade: " + prioridade;
    }
}
