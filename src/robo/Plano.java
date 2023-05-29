package robo;

import java.util.ArrayList;

public class Plano {
    private ArrayList<Celula> listaCelulas;
    
    public Plano(int tamanhoX, int tamanhoY) {
        listaCelulas = new ArrayList<>();
        int contador = 1;
        
        for (int i = 1; i <= tamanhoX; i++) {
            for (int j = 1; j <= tamanhoY; j++) {
                Celula celula = new Celula(contador, i, j);
                listaCelulas.add(celula);
                contador++;
            }
        }
    }
    
    public void verificarSeTemRobo() {
        for (Celula celula : listaCelulas) {
            if (celula.robo != null) {
                System.out.println("Tem robô " + celula.robo.getNome() + " - x: " + celula.posicaoX + " - y: " + celula.posicaoY);
            }
        }
    }
    
    public Celula retornarCelula(int x, int y) {
        for (int i = 0; i < listaCelulas.size(); i++) {
            Celula celula = listaCelulas.get(i);
            if (celula.posicaoX == x && celula.posicaoY == y) {
                return celula;
            }
        }
        return null;
    }
    
    public void imprimirCelulas() {
        for (int i = 0; i < listaCelulas.size(); i++) {
            System.out.println(listaCelulas.get(i).imprimir());
        }
    }
}
