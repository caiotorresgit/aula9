package robo;

public class Celula {
    public int posicaoX;
    public int posicaoY;
    public int id;
    public Robo robo;
    public Aluno aluno;
    public Bug bug;
    
    public Celula(int id, int x, int y) {
        posicaoX = x;
        posicaoY = y;
        this.id = id;
        robo = null;
        aluno = null;
        bug = null;
    }
    
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Celula: ").append(id).append(" x: ").append(posicaoX).append(" y: ").append(posicaoY);
        if (robo != null) {
            sb.append(" Robo: ").append(robo.getNome());
        }
        if (aluno != null) {
            sb.append(" Aluno: ").append(aluno.getId());
        }
        if (bug != null) {
            sb.append(" Bug");
        }
        return sb.toString();
    }
    
    public void adicionarRobo(Robo robo) {
        this.robo = robo;
        robo.setPosicao(this);
    }
    
    public void removerRobo() {
        robo = null;
    }
    
    public void adicionarAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public void removerAluno() {
        aluno = null;
    }
    
    public void adicionarBug(Bug bug) {
        this.bug = bug;
    }
    
    public void removerBug() {
        bug = null;
    }
    
    public boolean temAluno() {
        return aluno != null;
    }
    
    public boolean temBug() {
        return bug != null;
    }
    
    public boolean temRobo() {
        return robo != null;
    }
}
