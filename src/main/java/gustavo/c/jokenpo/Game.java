package gustavo.c.jokenpo;
import java.util.Random;

public class Game {
    ConsoleUtils display = new ConsoleUtils();
    Player player = new Player();
    Player cpu = new Player();
    
    public enum Choice  {
        PEDRA(1), PAPEL(2), TESOURA(3);
        private int choice;
        
        Choice(int valor) {
            choice = valor;
        }
    }
    
    public void startGame() {
        this.display.welcome();
        while(true){
            this.display.select();
            int playerMove = this.display.getInput();
            
            if(playerMove == 4) {
                this.display.bye();
                break;
            }
            
            int cpuChoice = this.getRandomPlay().choice;
            
            this.jokenpoLogic(playerMove, cpuChoice);
            this.display.board(this.player, this.cpu);
        }
        
    }
    
    public void showBoard() {
        this.display.board(this.player, this.cpu);
    }
    
    public Choice getRandomPlay() {
        Random random = new Random();
        return Choice.values()[random.nextInt(Choice.values().length)];
    } 
    
    public void jokenpoLogic(int yourChoice, int opChoice){
//        PEDRA(1), PAPEL(2), TESOURA(3);
        switch (yourChoice) {
            case 1:
                switch(opChoice){
                    
                    case 1:
                        this.battleResult("PEDRA", 3);
                        break;
                    case 2:
                        this.battleResult("PAPEL", 2);
                        break;
                    case 3:
                        this.battleResult("TESOURA", 1);
                        break;
                    default:
                        this.display.syserror();
                }
                break;
            case 2:
                switch(opChoice){
                    case 1:
                        this.battleResult("PEDRA", 1);
                        break;
                    case 2:
                        this.battleResult("PAPEL", 3);
                        break;
                    case 3:
                        this.battleResult("TESOURA", 2);
                        break;
                    default:
                        this.display.syserror();
                }
                break;
            case 3:
                switch(opChoice){
                    
                    case 1:
                        this.battleResult("PEDRA", 2);
                        break;
                    case 2:
                        this.battleResult("PAPEL", 1);
                        break;
                    case 3:
                        this.battleResult("TESOURA", 3);
                        break;
                    default:
                        this.display.syserror();
                }
                break;
            default:
                break;
        }
    }
    
    public void battleResult(String enemyChoice, int result){
//        VITORIA(1), DERROTA(2), EMPATE(3);
        switch(result){
            case 1:
                this.display.opponentChoice(enemyChoice);
                this.player.setVitorias(player.getVitorias() + 1);
                this.cpu.setDerrotas(cpu.getDerrotas() + 1);
                this.display.win();
                break;
            case 2:                
                this.display.opponentChoice(enemyChoice);
                this.player.setDerrotas(player.getDerrotas() + 1);
                this.cpu.setVitorias(cpu.getVitorias() + 1);
                this.display.lose();
                break;
            case 3:                
                this.display.opponentChoice(enemyChoice);
                this.player.setEmpates(player.getEmpates() + 1);
                this.cpu.setEmpates(this.cpu.getEmpates() + 1);
                this.display.draw();
                break;
            default:
                this.display.syserror();
        }
        
    }
}
