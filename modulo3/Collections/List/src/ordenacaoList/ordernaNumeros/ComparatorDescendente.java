package ordenacaoList.ordernaNumeros;

import java.util.Comparator;

public class ComparatorDescendente implements Comparator<Integer> {
	
	public int compare(Integer inteiro, Integer inteiro2) {
		if(inteiro > inteiro2) {
			return -1;
		}else if(inteiro < inteiro2) {
			return 1;
		}else
			return 0;
	}
}
