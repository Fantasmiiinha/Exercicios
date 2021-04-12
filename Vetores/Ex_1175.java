import javax.swing.JOptionPane;

public class Ex_1175 {

	public static void main(String[] args) {
		
		int n[] = new int [20];
		int troca, posi=1;

		for(int i=0; i<n.length; i++) {
			n[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n na posição" + i));
		}
		
		for(int z=0; z<n.length/2; z++) {
			
				 troca = n[z];
				 n[z] = n[n.length-posi];
				 n[n.length-posi]= troca;
			
			posi++;
		}
		
		for(int t=0; t<n.length;t++) {
			System.out.println("n["+t+"] = "+n[t]);
		}
		
	}

}
