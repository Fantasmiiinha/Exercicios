import javax.swing.JOptionPane;

public class Ex_1180 {

	public static void main(String[] args) {

		int n, menor=0, posi=0;
		int x[];
		
		do {
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
		}while(n<1 || n>1000);
		
		x= new int [n];
		
		for(int i=0; i<x.length; i++) {
			x[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x na posição " + i));
		}
		
		for(int z=0; z<x.length; z++) {
			if(z==0) {
			menor=x[z];
			}
			
			if(x[z]<menor) {
				menor=x[z];
				posi=z;
			}
		}
		
		System.out.println("Menor Valor: "+menor+"\n"+"Posicao: "+posi);
	}

}
