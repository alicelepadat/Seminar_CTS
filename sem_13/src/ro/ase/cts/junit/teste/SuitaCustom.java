package ro.ase.cts.junit.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.junit.teste.categorii.IConstructorCategory;
import ro.ase.cts.junit.teste.categorii.IGetPromovabilitateCategory;
import ro.ase.cts.junit.teste.categorii.ITesteUrgenteCategory;

@RunWith(Categories.class)
@SuiteClasses({
	TesteGrupaConstructor.class,
	TesteGrupaPromovabilitate.class,
	TesteGrupaFixture.class,
	TesteGrupaMock.class
})

//@Categories.IncludeCategory(IGetPromovabilitateCategory.class)
@Categories.ExcludeCategory(IConstructorCategory.class)

public class SuitaCustom {
	
}
