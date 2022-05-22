package functions;

public class SelecionarModalidade {
    private Modalidade modalidadeEscolhida;
    
    public Modalidade getModalidadeEscolhida() {
        return modalidadeEscolhida;
    }
    
    public void setModalidadeEscolhida(Modalidade modalidadeEscolhida) {
        this.modalidadeEscolhida = modalidadeEscolhida;
    }
    
    @Override
    public String toString() {
        return "StatusModalidade [modalidadeEscolhida=" + modalidadeEscolhida + "]";
    }
}
