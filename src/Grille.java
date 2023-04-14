public class Grille {
    private int nbLignes;
    private int nbColonnes;
    private char[][] grille;

    public Grille(int Lignes, int Colonnes) {
        this.nbLignes = Lignes;
        this.nbColonnes = Colonnes;
        this.grille = new char[nbLignes][nbColonnes];
    }

    public void setGrille(){
        for (int i = 0; i < nbLignes + 1; i++) {
            for (int j = 0; j < nbColonnes + 1; j++) {
                grille[i][j] = '0';
            }
        }
    }

    public void showGrille(){
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                System.out.print(grille[i][j]);
            }
            System.out.println();
        }
    }
}
