public class ServicoEstoque {
    public static boolean isAvailable(Produto product) {
        if (product.name == "Placa de vídeo") {
            System.out.println("Produto disponível no estoque");
            return true;
        }
        System.out.println("Produto indisponível no estoque");
        return false;
    }
}