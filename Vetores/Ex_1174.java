import javax.swing.JOptionPane;

public class Ex_1174 {

	public static void main(String[] args) {
		
		double a[] = new double [100];
		
		for(int i=0; i<a.length; i++) {
			a[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a na posição"+ i));
		}
		
		for(int z=0; z<a.length; z++) {
			if(a[z]<=10) 
			{
				System.out.println("A["+z+"] = " + a[z]);
			}
		}
	}

}
