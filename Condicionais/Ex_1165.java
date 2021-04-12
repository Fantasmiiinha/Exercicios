import javax.swing.JOptionPane;

public class Ex_1165 {

	public static void main(String[] args) {
		// ---------------- EXERCÍCIO 5 ------------------ //
		
				int n, x, multiplos=0;
				String frag="", saida="";
				
				n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números que se deseja testar"));
				
				if(n>=1 && n<=100) {
					for(int i = 1; i<=n; i++) {
						x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
						if(x>1 && x<=Math.pow(10, 7)) {
							for(int z = 1; z<=x;z++) {
								if(x%z==0) {
									multiplos++;
								}
							}
							if(multiplos==2) {
								frag= x + " eh primo";
							}
							else {
								frag= x + " não eh primo";
							}
							
							saida += frag + "\n";
							
							frag="";
							multiplos=0;
						}
					}
					JOptionPane.showMessageDialog(null, saida);
				}

	}

}
