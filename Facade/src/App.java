public class App {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Placa de vídeo");
        LogisticaFacade pedido = new LogisticaFacade(new ServicoEstoque(), new ServicoPagamento(), new ServicoRemessa());
        pedido.processarPedido(produto);
    }
}
