package ro.ase.cts.junit.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TesteGrupaConstructor.class,
	TesteGrupaPromovabilitate.class,
	TesteGrupaFixture.class,
	TesteGrupaMock.class
})

public class TesteSuite {
	
}
