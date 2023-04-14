public class Grille {
    private int nbLignes;
    private int nbColonnes;
    private char[][] grille;
    protected char[][] words;

    public void setWords(){
        this.words = new char[][]{
            {'m', 'u', 's', 'i', 'c'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'}
        };
        }
        
    public Grille(int Lignes, int Colonnes) {
        this.nbLignes = Lignes ;
        this.nbColonnes = Colonnes;
        this.grille = new char[nbLignes][nbColonnes];
    }

    public void setGrille(){
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes ; j++) {
               /* 
                if(i == 0 || j == 0 || i == nbLignes - 1 || j == nbColonnes - 1){
                    grille[i][j] = '~';
                }
                */
                grille[i][j] = '.';
                
            }
        }
    }
    public void  fillGrille(char[][] words){
        int lenWord = words.length;

        for(int i = 0; i < lenWord; i++){
            if(words[i].length != nbLignes){
                throw new IllegalArgumentException("Le mot n'est pas de la bonne taille");
            }
            else{
                for(int j = 0; j < nbLignes; j++){
                    grille[i][j] = words[i][j];
                }
            }   
        }
    }
    public void  hideGrille(){
        int randLigne;
        int randColonne;

        for(int i = 0; i < nbLignes; i++){
            for(int j = 0; j < nbColonnes; j++){
                randLigne = (int) (Math.random() * nbLignes);
                randColonne = (int) (Math.random() * nbColonnes);
                grille[randLigne][randColonne] = '.';
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
