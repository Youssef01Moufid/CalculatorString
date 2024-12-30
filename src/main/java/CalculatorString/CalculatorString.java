package CalculatorString;

public class CalculatorString {
    public int add(String nbrs) {
        int somme = 0 ;
        int lang = nbrs.length();

        if(lang == 0){
             somme = 0;
        }
        else if(lang == 1){
            String nb = nbrs.strip();
            somme = Integer.parseInt(nb);
        }

        else{
            String[] nombres = nbrs.split(",");
            int i = 0;
            while ( i < nombres.length){
                somme += Integer.parseInt(nombres[i].trim());
                i++;
            }
        }
        return somme ;

    }

}
