import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Emmanuel on 18/7/2016.
 */
public class client {

    public static void main(String[] args) throws IOException {



        Scanner kb = new Scanner(System.in);
        int selection;

        do {
            System.out.println("||==========================||");
            System.out.println("||   Welcome to URL-SHORT   ||");
            System.out.println("||==========================||");
            System.out.println("||  [1] METODO 1            ||");
            System.out.println("||  [2] METODO 2            ||");
            System.out.println("||  [3] METODO 3            ||");
            System.out.println("||  [4] QUIT                ||");
            System.out.println("||==========================||");

            System.out.println("Insert selection: ");

            selection = kb.nextInt();


            switch (selection) {

                case 1:
                    System.out.println("Option 1 ");
                    //METODO #1
                    break;

                case 2:
                    System.out.println("Option 1 ");
                    //METODO #2
                    break;

                case 3:
                    System.out.println("Option 1 ");
                    //METODO #3
                    break;

                case 4:
                    System.out.println("----------------------------------");
                    System.out.println("!Thank you for using our services!");
                    break;

                default:
                    System.out.println("LA OPCION DIGITADA NO ES VALIDA");
                    break;
            }
            ;
        } while (selection != 4);
    }
}

/* Request
----------------------------------------------------------------

    GetRequest request = Unirest.get(String url);
    GetRequest request = Unirest.head(String url);
    HttpRequestWithBody request = Unirest.post(String url);
    HttpRequestWithBody request = Unirest.put(String url);
    HttpRequestWithBody request = Unirest.patch(String url);
    HttpRequestWithBody request = Unirest.options(String url);
    HttpRequestWithBody request = Unirest.delete(String url);

    Shutdown
-----------------------------------------------------------------
    Unirest.shutdown();
*/


