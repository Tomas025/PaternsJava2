public class App {
    public static void main(String[] args) throws Exception {
        GameConfig gameConfig1 = GameConfig.getInstance();
        GameConfig gameConfig2 = GameConfig.getInstance();

        if (gameConfig1 == gameConfig2) {
            System.out.println("As instâncias são iguais");
        } else {
            System.out.println("As instâncias são diferentes");
        }
    }
}