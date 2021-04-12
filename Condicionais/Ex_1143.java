import javax.swing.JOptionPane;

public class Ex_1143 {

	public static void main(String[] args) {
		// ---------------- EXERCÍCIO 3 ------------------ //
		
				int n,num1, num2;
				String saida="", frag="";
				
				n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n"));
				
				if(n>1 && n<1000) {
					for(int i = 1; i<=n; i++) {
						
						num1 = i * i;
						num2 = num1 * i;
						frag = i +" "+num1 + " "+num2;
						
						saida += frag + "\n";
						frag="";
						num1=0;
						num2=0;
						
					}
					JOptionPane.showMessageDialog(null, saida);
				}

	}

}
