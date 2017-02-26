package metododeburbuja;
//libreria para la lectura por medio del teclado
import java.util.Scanner;
/**
 * @author Anderson Suarez, Andres Chila
 * @version 1.0
 * @since 26/02/2017
 */
public class MetodoDeBurbuja {

    public MetodoDeBurbuja(){
        //objeto scaner (sc) reemplazando al entradaTeclado dado por el profesor
        Scanner sc = new Scanner(System.in);
        //impresion en pantalla 
        System.out.print("Digite la cantidad a organizar: ");
        //Lectura de la cantidad de numeros a organzar
        int arr = sc.nextInt();
        //una vez leida la cantidad se crea el arreglo
        int arreglo[] =new int[arr];
        //es una simple impresion para dar un espacio de lineado
        System.out.println();
        //inicializamos el for que se encargara de la lectura de los datos 
        int j = 0;
        for (int i=0 ; i<arreglo.length;i++){
            j+=1;
            System.out.print("Elemento " + j + " : ");
            arreglo[i] = sc.nextInt();
        }
        burbuja(arreglo);
        }
        //Toco declararlo estatic, la verdad no se porque me arrojaba un error y esa es la opcion que da el compilador para evitar el error
        public static void burbuja(int arreglo1[]){
        // Metodo burbuja propio de internet
        for(int i = 0; i < arreglo1.length - 1; i++){
            for(int j = 0; j < arreglo1.length - 1; j++){
                if (arreglo1[j] > arreglo1[j + 1]){
                    int tmp = arreglo1[j+1];
                    arreglo1[j+1] = arreglo1[j];
                    arreglo1[j] = tmp;
                }
            }
        }
        //Impresion de las posiciones 
        for(int i=0;i< arreglo1.length; i++){
            System.out.print(arreglo1[i]+", ");
        }
    }

    public static void main(String[] args){
        //Constructor en el main para poder ejecutar fuera del mismo
        MetodoDeBurbuja metodoDeBurbuja = new MetodoDeBurbuja();
    }
    
}
