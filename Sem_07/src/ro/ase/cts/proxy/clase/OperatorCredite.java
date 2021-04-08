package ro.ase.cts.proxy.clase;

public class OperatorCredite implements IOperatorCredite {

	@Override
	public void creareCredit(MonedaEnum moneda, int suma) {
		// TODO Auto-generated method stub
		System.out.println("S-a oferit creditul in valoare de " + suma + " in moneda "+moneda+".");
	}

}
