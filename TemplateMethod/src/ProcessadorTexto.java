public abstract class ProcessadorTexto {
    public final String processarTexto(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresProcessados = converterCaracteres(caracteres);
        String resultado = juntarCaracteresProcessados(caracteresProcessados);
        return resultado;
    }

    public char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }
    
    public abstract char[] converterCaracteres(char[] chars);

    public String juntarCaracteresProcessados(char[] chars) {
        return new String(chars);
    }
}