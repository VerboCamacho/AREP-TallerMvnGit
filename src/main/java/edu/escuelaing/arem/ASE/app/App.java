package edu.escuelaing.arem.ASE.app;

/**
 * class with the main metod
 * @author Verbo Camacho Villamarin
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "A continucacion los resultados de la lista de numeros leidos en el archivo" );
        ReadFile data = new ReadFile("datos.txt");
        LinkedList lista = data.getData();
        Calculator calculo = new Calculator(lista);
        System.out.printf("La media es: %.2f %n",calculo.mean());
        System.out.printf("La desviacion estandar es: %.2f %n",calculo.standarDeviation());
    }


}
