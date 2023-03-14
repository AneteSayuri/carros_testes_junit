package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class CarroServiceTest {

    //Cada teste será um método
    @Test
    public void deveAcelerarCorretamenteUmCarroLigado(){
        //Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        //When
        carroService.acelerar(carro, 10);

        //Then - Asserts
        //Se o método Não possui assertiva, ele vai passar.
//        Assert.assertTrue(carro.getVelocidadeAtual() == 10);
//        Assert.assertEquals((Integer) 10, carro.getVelocidadeAtual());
        Integer velocidadeEsperada = 10;
        Assert.assertEquals(velocidadeEsperada, carro.getVelocidadeAtual());
    }

    @Test
    public void deveLigarCorretamente(){
        //Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        //When
        carroService.ligar(carro);

        //Then - Asserts
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void carroEmMovimentoNaoPodeSerDesligado() {
//        - Given: Um carro ligado; Um carro andando
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);
        carroService.acelerar(carro, 10);
//        - When: Carro desligar
            carroService.desligar(carro);
//        - Then: Carro deve permanecer ligado
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void carroNaoPodeUltrapassarVelocidadeMaxima() {
//        - Given: Um carro ligado, Um carro andando na velocidade máxima
    CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);
        carro.setVelocidadeAtual(carro.getVelocidadeMaxima());
//        - When: Acelerar o carro
        carroService.acelerar(carro, 10);
//        - Then: Carro deve permanecer na velocidade máxima
        Assert.assertEquals(carro.getVelocidadeMaxima(), carro.getVelocidadeAtual());
}

    @Test
    public void carroDesligadoNaoPodeAcelerar() {
        // Given: um carro desligado
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When: acelerar e frear carro
        carroService.acelerar(carro,20);

        // Then: Nao acelerar e nem frear, ou seja, velAtual = 0
//        Assert.assertFalse(carro.getLigado());
        Integer velocidadeParada = 0;
        Assert.assertEquals(velocidadeParada, carro.getVelocidadeAtual());
    }

    @Test
    public void carroDesligadoNaoPodeFrear() {
        // Given: um carro desligado
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When: acelerar e frear carro
        carroService.frear(carro, 10);

        // Then: Nao acelerar e nem frear, ou seja, velAtual = 0
        Integer velocidadeParada = 0;
        Assert.assertEquals(velocidadeParada, carro.getVelocidadeAtual());
    }
}
