public class App {
    public static void main(String[] args) throws Exception {
        //Para funcionar corretamente, o nome do produto deve ser
        // "Celular" ou "Computador", por questões de simplicidade
        Produto produto = new Produto(1, "Celular");
        LogisticaFacade pedido = new LogisticaFacade(new ServicoEstoque(), new ServicoPagamento(), new ServicoRemessa());
        pedido.processarPedido(produto);
    }
}
