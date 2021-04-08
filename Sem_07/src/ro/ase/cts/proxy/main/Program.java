package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.*;

public class Program {

	public static void main(String[] args) {
		OperatorCredite operator = new OperatorCredite();
		operator.creareCredit(MonedaEnum.EUR, 3000);
		
		OperatorCrediteProxy proxy = new OperatorCrediteProxy(operator);
		proxy.creareCredit(MonedaEnum.USD, 2500);
		proxy.creareCredit(MonedaEnum.RON, 5000);
	}

}
