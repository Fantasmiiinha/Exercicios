import javax.swing.JOptionPane;

public class Ex_1134 {

	public static void main(String[] args) {
		// ---------------- EXERC�CIO 4 ------------------ //
		
			int gas=0, alcool=0, disel=0, pref;
			
			do {
				pref = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de combut�vel (1-�lcool, 2-Gasolina, 3-Disel, 4-Sair)"));
				
				if(pref==1) {
					alcool++;
				}
				if(pref==2) {
					gas++;
				}
				if(pref==3) {
					disel++;
				}
			}while(pref != 4);
			
			JOptionPane.showMessageDialog(null, "MUITO OBRIGADO" + "\n" +
												"�lcool: " +alcool +"\n"+
												"Gasolina: " +gas + "\n"+
												"Disel: " +disel + "\n");
			

	}

}
