package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_generic_sort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericSortApplication {

    public static void main(String[] args) {
        GenericSortService genericSortService = new GenericSortService();
        genericSortService.genericSort(args);
        for (String elemento: args
             ) {
            System.out.println(elemento);
        }
    }

}
