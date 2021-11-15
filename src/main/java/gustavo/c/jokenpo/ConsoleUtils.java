package gustavo.c.jokenpo;
import java.util.Scanner;

public class ConsoleUtils {    
    Scanner input = new Scanner(System.in);
    
    public void welcome(){
        System.out.println("Bem vindo!");
    }
    
    public void board(Player player, Player cpu){
        System.out.println("\nVitorias"+"\nPlayer: "+player.getVitorias()+" - "
                          +"CPU: "+cpu.getVitorias()+"");
        System.out.println("\nDerrotas"+"\nPlayer: "+player.getDerrotas()+" - "
                          +"CPU: "+cpu.getDerrotas()+"");
        System.out.println("\nEmpates"+"\nPlayer: "+player.getEmpates()+" - "
                          +"CPU: "+cpu.getEmpates()+"\n");
    }
    
    
    public void select() {
        System.out.println("Selecione pedra(1), papel(2), tesoura(3) ou sair(4): ");
    }
    
    public void opponentChoice(String enemyChoice) {
        System.out.println("Seu oponente escolheu " + enemyChoice + "!\n");
    }
    
    
    public void win() {
        System.out.println("Você venceu!\n");
    }
    
    public void lose() {
        System.out.println("Você perdeu!\n");
    }
    
    public void draw() {
        System.out.println("Empatou!\n");
    }
    
    public void bye() {
        System.out.println("Tchau!\n");
    }
    
    public int getInput(){
        while (true) { 
            if (this.input.hasNextInt()) {
                int num = this.input.nextInt();    
            if (num <= 4 && num >= 1) {
                return num;
            }
         } else {
            System.out.println("Digite apenas 1, 2, 3 ou 4: \n");
            this.input.next();
         }
        }
    }
    
    public void syserror(){
        System.out.println("Erro!\n");
    }
    
    
}
