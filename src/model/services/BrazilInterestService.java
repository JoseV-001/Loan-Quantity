package model.services;

public class BrazilInterestService implements InterestService {

    private Double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
        // Este metodo não pode ser implementado como 'default' na interface,
        // pois depende de um valor de instância (estado) específico de cada serviço.
        // Métodos 'default' em interfaces não devem acessar estado de instância.
    }
}
