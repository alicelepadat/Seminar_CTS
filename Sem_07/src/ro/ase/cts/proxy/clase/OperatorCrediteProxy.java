package ro.ase.cts.proxy.clase;

public class OperatorCrediteProxy implements IOperatorCredite{

	private OperatorCredite operator;
	
	
	
	public OperatorCrediteProxy(OperatorCredite operator) {
		super();
		this.operator = operator;
	}

	@Override
	public void creareCredit(MonedaEnum moneda, int suma) {
		if(moneda == MonedaEnum.RON) {
			operator.creareCredit(moneda, suma);
		}
		else {
			System.out.println("In prezent, banca ofera doar credite in RON.");
		}
	}

}
