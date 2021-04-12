import javax.swing.JOptionPane;
		
public class Ex_1101 {

	public static void main(String[] args) {
		    
		        
	     int n = 0, m = 0, trocar = 0, soma = 0;
		        
		   do {
		        String seq = "";
		        
		        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de m"));
				m = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n"));
		        
		        if(n > 0 && m > 0) {

		            if(n > m ) {
		                trocar = n;
		                n = m;
		                m = trocar;
		            }
		        
		            for(int i = n; i <= m; i++) {
		                seq += " " + i;
		                soma += i;
		            }
		            
		            JOptionPane.showMessageDialog(null, seq + " Sum=" + soma);
		            soma = 0;
		            seq = "";
		            trocar = 0;
		        }
         } while(n > 0 && m > 0);
     }
 }

	


