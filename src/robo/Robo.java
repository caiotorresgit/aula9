package robo;

public class Robo {
    private int id;
    private String nome;
    private int posicaoX;
    private int posicaoY;
    private Plano plano;
    
    public Robo(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
        this.id = id;
        this.nome = nome;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.plano = plano;
        
        Celula celula = plano.retornarCelula(posicaoX, posicaoY);
        if (celula != null) {
            celula.robo = this;
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setPosicao(Celula celula) {
        this.posicaoX = celula.posicaoX;
        this.posicaoY = celula.posicaoY;
    }
    
    public void moverEsquerda() {
        Celula celulaAtual = plano.retornarCelula(posicaoX, posicaoY);
        Celula celulaAnterior = plano.retornarCelula(posicaoX - 1, posicaoY);
        
        if (celulaAtual != null && celulaAnterior != null && celulaAnterior.robo == null) {
            celulaAtual.robo = null;
            celulaAnterior.robo = this;
            posicaoX--;
        }
    }
    
    public void moverDireita() {
        Celula celulaAtual = plano.retornarCelula(posicaoX, posicaoY);
        Celula celulaProxima = plano.retornarCelula(posicaoX + 1, posicaoY);
        
        if (celulaAtual != null && celulaProxima != null && celulaProxima.robo == null) {
            celulaAtual.robo = null;
            celulaProxima.robo = this;
            posicaoX++;
        }
    }
}
