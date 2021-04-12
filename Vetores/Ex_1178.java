import javax.swing.JOptionPane;

public class Ex_1178 {

	public static void main(String[] args) {

		double c[] = new double [100];
		String result="";
		
		c[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
				
		for(int i=1; i<c.length; i++) {
				c[i]= c[i-1]/2;
		}
		
		for(int z=0; z<c.length; z++) {
			result= String.format("%.4f", c[z]);
			System.out.println("c["+z+"] = "+result);
		}
		
	}

}
