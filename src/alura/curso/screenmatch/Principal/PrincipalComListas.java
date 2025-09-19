package alura.curso.screenmatch.Principal;

import alura.curso.screenmatch.modelo.Filme;
import alura.curso.screenmatch.modelo.Serie;
import alura.curso.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Star Wars", 2000);
        filme1.avalia(9);
        Filme filme2 = new Filme("Avatar", 2023);
        filme2.avalia(10);
        Filme filme3 = new Filme("Pokemon 1", 2000);
        filme3.avalia(4);
        Filme filme4 = new Filme("Digimon 1", 2001);
        filme4.avalia(7.5);


        Serie kimetsu = new Serie("Kimetsu no Yaba", 2019);
        Serie jujutsu = new Serie("Jujutsu", 2019);

        ArrayList<Titulo> listadeAssistidos = new ArrayList<>();

        listadeAssistidos.add(filme1);
        listadeAssistidos.add(filme2);
        listadeAssistidos.add(filme3);
        listadeAssistidos.add(filme4);
        listadeAssistidos.add(kimetsu);

        for (Titulo item : listadeAssistidos){
            if (item.getClass() == Filme.class ) {
                System.out.println("Nome do filme: " + item.getNome());
                // Sintaxe do instaceof = iterador do for(item) INSTACEOF Classe(Filme) Nova variavel(filme)
                if (item instanceof Filme filme && filme.getClassifcação() > 1) {
                    System.out.println("Classsificação: " + filme.getClassifcação());
                }
//            Filme filme = (Filme) item;
//            System.out.println("Nome do filme: " + item.getNome());
//            //Fazer um type cast para mudar o tipo de titulo para filme
//            System.out.println("Classificação: " + filme.getClassifcação());
            }else {
                System.out.println("Nome da Série: " + item.getNome());

            }
        }
    }
}
