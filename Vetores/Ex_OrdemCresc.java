
import javax.swing.JOptionPane;

public class Ex_OrdemCresc {

	public static void main(String[] args) {
		
		int[] x = new int[10];
		int maior=0, menor=0,posima=0,posime=0;
		int trocar=0;
		String saida= "";
		
		for(int i=0; i<x.length; i++) 
		{
			x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x["+i+"]"));
		}

		for(int i=0; i<x.length; i++) 
		{
			if(i==0) {
				maior=x[0];
				menor=x[0];
			}
			
			if(x[i]>maior) 
			{
				maior=x[i];
				posima=i;
			}
			if(x[i]<menor) 
			{
				menor=x[i];
				posime=i;
			}
		}
		
		String frag = "O maior número digitado foi "+ maior + " na posição " + posima +" \n"+
					  "O menor númeor digitado foi "+ menor + " na posição " + posime;
		
		JOptionPane.showMessageDialog(null,frag);
		
		for(int y = 0; y < x.length; y++) {
            for(int i = 0; i < x.length; i++) {
                if(i != 0) {
                    if(x[i] < x[i - 1]) {
                        trocar = x[i];
                        x[i] = x[i - 1];
                        x[i-1] = trocar;
                    }
                }
            }
        } 
		
		for(int i=0; i<x.length; i++) {
			saida+= "x["+ i+"] = "+ x[i] +"\n";
		}
		
		JOptionPane.showMessageDialog(null,saida);
	}

}
