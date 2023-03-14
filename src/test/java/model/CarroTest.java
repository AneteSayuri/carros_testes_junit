package model;

import org.junit.Assert;
import org.junit.Test;
import service.CarroService;

public class CarroTest {

    @Test
    public void todoCarroDeveIniciarDesligado(){
        //Given
        Carro carro = new Carro();

        //Then - Asserts
        Assert.assertFalse(carro.getLigado());
    }
}
