package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void copiar() {
		// TODO Auto-generated method stub
		System.out.println("Copiando via equipamento multifuncional!");
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo via equipamento multifuncional!");
	}

	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		System.out.println("Digitalizando via equipamento multifuncional!");
	}
	
}
