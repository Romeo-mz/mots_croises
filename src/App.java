public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Grille grille_test = new Grille(5, 5);
        grille_test.setWords();
        grille_test.setGrille();
        grille_test.fillGrille(grille_test.words);
        grille_test.hideGrille();
        grille_test.showGrille();
    }
}
