package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgentieComposite agentie1 = new AgentieComposite();
		AgentieComposite agentie2 = new AgentieComposite();
		AgentieComposite agentie3 = new AgentieComposite();
		
		Filiala filiala1 = new Filiala("Filiala 1");
		Filiala filiala2 = new Filiala("Filiala 1");
		Filiala filiala3 = new Filiala("Filiala 1");
		Filiala filiala4 = new Filiala("Filiala 1");

		agentie1.adaugaNod(filiala1);
		agentie1.adaugaNod(filiala2);
		agentie1.adaugaNod(agentie3);
		
		agentie2.adaugaNod(filiala3);
		agentie3.adaugaNod(filiala4);
		
		System.out.println("Agentie 1:");
		agentie1.afiseazaDescriere();
		
		System.out.println("Agentie 2:");
		agentie2.afiseazaDescriere();
		
		agentie3.stergeNod(filiala4);
		agentie1.adaugaNod(filiala4);
		agentie1.stergeNod(agentie3);
		
		System.out.println("Agentie 1:");
		agentie1.afiseazaDescriere();
		
	}

}
