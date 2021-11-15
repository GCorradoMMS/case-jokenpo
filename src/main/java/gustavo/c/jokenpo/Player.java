package gustavo.c.jokenpo;

public class Player {
    
    private int vitorias, derrotas, empates;
    
    public Player() {
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
