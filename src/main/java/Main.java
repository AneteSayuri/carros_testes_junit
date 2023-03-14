import model.Carro;
import service.CarroService;

public class Main {
    /**
     *
     * Um carro tem os seguintes atributos:
     *  - cor
     *  - marca
     *  - modelo
     *  - ligado
     *  - velocidadeAtual
     *  - velocidadeMáxima
     *
     *  Enquanto o carro estiver desligado deve ser capaz de:
     *  - Ligar
     *  - Mostrar estado atual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     *
     * - Só podemos realizar as ações como acelerar e frear com o carro ligado
     * - Só podemos desligar o carro quando ele parar totalmente (velocidadeAtual = 0)
     * - Não existe velocidade negativa
     * - O carro não pode passar de sua velocidade máxima
     *
     */

    public static void main(String[] args) {

//        Given - When - Then

//        Cenário 1
//        - Given: Um carro desligado
        CarroService carroService1 = new CarroService();
        Carro carro1 = new Carro();
//        - When: Ligar carro
        carroService1.ligar(carro1);
//        - Then: Carro deve estar ligado
        System.out.println(carro1.getLigado() == true);


//        Cenário 2
//        - Given: Um carro
        CarroService carroService2 = new CarroService();
        Carro carro2 = new Carro();
//        - When: Ligar o carro; Acelerar o carro
        carroService2.ligar(carro2);
        carroService2.acelerar(carro2, 10);
//        - Then: A velocidade deve ser 10km/h
        System.out.println(carro2.getVelocidadeAtual() == 10);


//        Cenário 3
//        - Given: Um carro ligado; Um carro andando
        CarroService carroService3 = new CarroService();
        Carro carro3 = new Carro();
        carroService3.ligar(carro3);
        carroService3.acelerar(carro3, 10);
//        - When: Carro desligar
        if (carro3.getVelocidadeAtual() == 0){
            carroService3.desligar(carro3);
        }
//        - Then: Carro deve permanecer ligado
        System.out.println(carro2.getLigado() == true);


//        Cenário 4
//        - Given: Um carro ligado, Um carro andando na velocidade máxima
        CarroService carroService4 = new CarroService();
        Carro carro4 = new Carro();
        carroService4.ligar(carro4);
        for (int i=0; i<6; i++){
            carroService4.acelerar(carro4, 10);
        }
//        - When: Acelerar o carro
        if (carro4.getVelocidadeAtual() < 60){
            carroService4.acelerar(carro4, 10);
        }
//        - Then: Carro deve permanecer na velocidade máxima
        System.out.println(carro4.getVelocidadeAtual() == 60);

    }

}
