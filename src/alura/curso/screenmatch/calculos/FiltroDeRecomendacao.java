package alura.curso.screenmatch.calculos;

public class FiltroDeRecomendacao {

    public void filtra(classificavel classificavel){
        if (classificavel.getClassifcação() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if (classificavel.getClassifcação() >= 2){
            System.out.println("Muito bem avalido no momento!!");
        }else {
            System.out.println("COloque na sua lista para assistir depois");
        }
    }

}
