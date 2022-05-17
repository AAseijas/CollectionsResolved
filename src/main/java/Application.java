import model.OperationTypeEnum;
import model.Posting;
import model.RealestateTypeEnum;
import utils.PostingService;
import java.util.List;

/*
   Utilizando los métodos de la clase PostingUtils, implementar :
   1- Método que muestre por pantalla los elementos de la collection devuelta por getPostings()
   2- Método que elimine de la collection getPostings() los postings existentes en getPostingsToRemove() y mostrar por pantalla el resultado
   3- Metodo que muestre todos los postings que tiene tipo de operacion SELL y tipo de propiedad APARTMENT
   4- Método que muestre todos los postings que tiene tipo de operacion RENT y tipo de propiedad HOUSE
*/
public class Application {

    public static void main(String[] args) {

        //PostingService.show();

        System.out.println("--------------------------------------------------------");
        System.out.println("1)_");
        PostingService.showAllPosting();
        System.out.println("-------------------------------------------------------");
        System.out.println("2)_");
        PostingService.eliminatePosting();
        System.out.println("--------------------------------------------------------");
        System.out.println("3)_");
        List<Posting> postFIltered1 = PostingService.showPostingByParameters(OperationTypeEnum.SELL, RealestateTypeEnum.APARTMENT);
        for (Posting postFilt : postFIltered1) {
            System.out.println(postFilt);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("5)_");
        List<Posting> postFIltered2 = PostingService.showPostingByParameters(OperationTypeEnum.RENT, RealestateTypeEnum.HOUSE);
        for (Posting postFilt : postFIltered2) {
            System.out.println(postFilt);
        }
        System.out.println("--------------------------------------------------------");
    }
}
