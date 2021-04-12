import javax.swing.JOptionPane;

public class Ex_1173 {

	public static void main(String[] args) {

		int n[] = new int [10];
		int v = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de v"));
		
		while(v<=0 || v>50) {
			v = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 0 e 50"));
		}
		
			for(int i=0; i<n.length; i++) {
				n[0]=v;
				if(i!=0) {
					n[i] = n[i-1]*2;
				}
			}
			
			for(int z=0; z<n.length; z++) {
				System.out.println("n["+z+"] = "+n[z]);
			}

	}
}
