
package exemploswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class ExemploSwitch {


    public static void main(String[] args) {
        String res=JOptionPane.showInputDialog("Dia e numero");
        int dia= Integer.parseInt(res);
        switch(dia){
            case 1:JOptionPane.showMessageDialog(null,"luns");
                break;
            case 2:JOptionPane.showMessageDialog(null,"martes");
                break;
                
            case 3:JOptionPane.showMessageDialog(null,"miercoles");
                break;
                 
            case 4:JOptionPane.showMessageDialog(null,"xoves");
                break;    
               
            case 5:JOptionPane.showMessageDialog(null,"viernes");
                break;  
            
             
            case 6:JOptionPane.showMessageDialog(null,"sabado");
                break;
                
            case 7:JOptionPane.showMessageDialog(null,"domingo");
                break;    
                
            default:JOptionPane.showMessageDialog(null,"Numeros entre 1 e 7");
        }
        JOptionPane.showMessageDialog(null,"salin do metodo");
        
        
        
        
        
        
    }
    
}
