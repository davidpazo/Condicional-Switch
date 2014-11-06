package condicionais;
// * @author dpazolopez */

import java.util.Scanner;

public class CondicionSwitch {

       public static void main(String[] args) {
           Scanner op=new Scanner(System.in);
           System.out.println("****MENU****");
           System.out.println("UN-> Escribe un /n + DOUS->Escribe dous /n + TRES-> Escribe tres");
        String opcion = op.nextLine().toLowerCase();
        switch(opcion){
            case "un": System.out.println("un");
                break;
            case "dous": System.out.println("dos");
                break;
            case "tres": System.out.println("tres");
                break;
            default: System.out.println("elixe opcion");
        }
    }
    
}
