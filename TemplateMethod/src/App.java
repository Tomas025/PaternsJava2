public class App {
    public static void main(String[] args) {
        ProcessadorTexto processadorMaiuscula = new TudoMaiuscula();
        ProcessadorTexto processadorMinuscula = new TudoMinuscula();
        String texto = "BORA querer EssE euRo TRuCK";
        
        String tudoMaiusculo = processadorMaiuscula.processarTexto(texto);
        System.out.println("Texto com letras maiúsculas: " + tudoMaiusculo);

        String tudoMinusculo = processadorMinuscula.processarTexto(texto);
        System.out.println("Texto com letras minúsculas: " + tudoMinusculo);
    }
}