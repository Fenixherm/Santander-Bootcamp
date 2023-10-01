package fabrica;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = new Deskjet();
		
		impressora.imprimir();
		
		em.copiar();
		em.digitalizar();
		em.imprimir();
	}
}
