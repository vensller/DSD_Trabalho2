package Main;

import View.ClockView;
import View.ServerView;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivens
 */
public class Main {
    
    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog("Digite a opção desejada: \n"
                                                  + "1 - Servidor.\n"
                                                  + "2 - Cliente.\n"
                                                  + "Qualquer outra para sair.");
        
        switch(option){
            case "1" : 
                ServerView serverView = new ServerView();
                serverView.setVisible(true);
                serverView.init();
                break;                       
                
            case "2" :
                ClockView clockView = new ClockView();
                clockView.setVisible(true);
                clockView.init();
                break;
                
            default : System.exit(0);
        }
}
    
}
