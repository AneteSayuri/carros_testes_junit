package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class AssertivasTest {

    @Test
    public void assertEquals_Exemplo(){
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        Carro carro2 = new Carro();
        carro2.setMarca("Fiat");

        Assert.assertEquals(carro1, carro2);
    }

    @Test
    public void assertNotEquals_Exemplo(){
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        Carro carro2 = new Carro();
        carro2.setMarca("Gol");

        Assert.assertNotEquals(carro1, carro2);
    }

    @Test
    public void assertTrue_Exemplo(){
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void assertFalse_Exemplo(){
        Carro carro = new Carro();
        Assert.assertFalse(carro.getLigado());
    }

    @Test
    public void assertNull_Exemplo(){
        Carro carro = null;
        Assert.assertNull(carro);
    }

    @Test
    public void assertNotNull_Exemplo(){
        Carro carro = new Carro();
        Assert.assertNotNull(carro);
    }

    @Test
    public void assertSame_Exemplo(){
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        Carro carro2 = carro1;

        //Pelo endereço de memória: mesmo objeto
        Assert.assertSame(carro1, carro2);
    }

    @Test
    public void assertNotSame_Exemplo(){
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        Carro carro2 = new Carro();
        carro2.setMarca("Fiat");

        //Pelo endereço de memória: objetos diferentes
        Assert.assertNotSame(carro1, carro2);
    }

}
