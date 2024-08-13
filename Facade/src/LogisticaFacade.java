public class LogisticaFacade {
    ServicoEstoque servicoEstoque;
    ServicoPagamento servicoPagamento;
    ServicoRemessa servicoRemessa;

    public LogisticaFacade(ServicoEstoque estoque, ServicoPagamento pagamento, ServicoRemessa remessa) {
        this.servicoEstoque = estoque;
        this.servicoPagamento = pagamento;
        this.servicoRemessa = remessa;
    }

    public void processarPedido(Produto produto) {
        boolean isAvailable = ServicoEstoque.isAvailable(produto);
        if(isAvailable){
            boolean pagamentoCompleto = ServicoPagamento.makePayment();
            if(pagamentoCompleto){
                ServicoRemessa.shipProduct(produto);
            }
        }
    }
}