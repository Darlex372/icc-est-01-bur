

public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodoOrdenamiento = new Metodos();

        int[] arreglo = {5, 7, 30, 12, 9};
        int[] arregloOrdenado = metodoOrdenamiento.sortByBubble(arreglo);
        metodoOrdenamiento.printArreglo(arregloOrdenado);

        int[] arregloD = {5, 7, 30, 12, 9};
        int[] arregloOrdenadoDes = metodoOrdenamiento.sortByBubbleDes(arregloD);
        metodoOrdenamiento.printArregloDes(arregloOrdenadoDes);

        //ORDENA LAS PALABRAS ALFABETICAMENTE DE LA CADENA DE TEXTO
        String cadena="este es un ejemplo de texto para ordenar";
        String[] palabras =cadena.split(" ");
        String[] palabrasOrdenara= metodoOrdenamiento.sortByBubblePalabras(palabras);
        metodoOrdenamiento.printArreglo(palabrasOrdenara);
    }
}