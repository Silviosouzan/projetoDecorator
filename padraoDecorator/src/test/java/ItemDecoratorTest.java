import org.junit.Assert;
import org.junit.Test;

public class ItemDecoratorTest {

    @Test
    public void testEspadaMagica() {
        Item espadaBase = new Espada("Espada Poderosa", 10, "Uma espada afiada e poderosa");


        Item espadaMagica = new EspadaMagica(espadaBase);

        Assert.assertEquals("Espada Poderosa", espadaMagica.getNome());
        Assert.assertEquals(20, espadaMagica.getPoder()); // O poder é aumentado em 10 pela EspadaMagica
        Assert.assertEquals("Uma espada afiada e poderosa, com poder mágico", espadaMagica.getDescricao());
    }

    @Test
    public void testArmaduraFortalecida() {

        Item armaduraBase = new Armadura("Armadura Pesada", 30, "Uma armadura resistente");


        Item armaduraFortalecida = new ArmaduraFortalecida(armaduraBase);


        Assert.assertEquals("Armadura Pesada", armaduraFortalecida.getNome());
        Assert.assertEquals(50, armaduraFortalecida.getPoder()); // O poder é aumentado em 20 pela ArmaduraFortalecida
        Assert.assertEquals("Uma armadura resistente, com resistência adicional", armaduraFortalecida.getDescricao());
    }
}
