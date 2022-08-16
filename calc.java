package waldeck;

import javax.swing.JOptionPane;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String repetir = null;
		 do{
			 
		 
		String opcao;
		opcao = JOptionPane
				.showInputDialog("Escolha a opção " + "\n1 - Soma" + "\n2 - Sub" + "\n3 - Mult" + "\n4 - Div");

		int opt;
		opt = Integer.parseInt(opcao);
		String n1;
		String n2;
		double numero1;
		double numero2;
		double resultado;
		String msg;

		
		
		
		switch (opt) {

		case 1:

			n1 = JOptionPane.showInputDialog("Digite o primeiro valor");
			n2 = JOptionPane.showInputDialog("Digite o segundo valor");

			numero1 = Double.parseDouble(n1);
			numero2 = Double.parseDouble(n2);

			resultado = numero1 + numero2;

			msg = "O resuldado da operação é: " + resultado;
			JOptionPane.showMessageDialog(null, msg);

			break;

		case 2:

			n1 = JOptionPane.showInputDialog("Digite o primeiro valor");
			n2 = JOptionPane.showInputDialog("Digite o segundo valor");

			numero1 = Double.parseDouble(n1);
			numero2 = Double.parseDouble(n2);

			resultado = numero1 - numero2;

			msg = "O resuldado da operação é: " + resultado;
			JOptionPane.showMessageDialog(null, msg);

			break;

		case 3:

			n1 = JOptionPane.showInputDialog("Digite o primeiro valor");
			n2 = JOptionPane.showInputDialog("Digite o segundo valor");

			numero1 = Double.parseDouble(n1);
			numero2 = Double.parseDouble(n2);

			resultado = numero1 * numero2;

			msg = "O resuldado da operação é: " + resultado;
			JOptionPane.showMessageDialog(null, msg);

			break;

		case 4:

			n1 = JOptionPane.showInputDialog("Digite o primeiro valor");
			n2 = JOptionPane.showInputDialog("Digite o segundo valor");

			numero1 = Double.parseDouble(n1);
			numero2 = Double.parseDouble(n2);

			resultado = numero1 / numero2;

			msg = "O resuldado da operação é: " + resultado;
			JOptionPane.showMessageDialog(null, msg);

			break;

		default:
			msg = "peração é invalida: ";
			JOptionPane.showMessageDialog(null, msg);
		}
		
		repetir = JOptionPane.showInputDialog("Deseja fazer outra conta ?");
		 }while(repetir.equalsIgnoreCase("Sim"));
		     
		 }

	}


