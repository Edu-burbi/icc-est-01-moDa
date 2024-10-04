
public class App {

    public static void main(String[] args) throws Exception {
        metodoOrdenamiento mO = new metodoOrdenamiento();
        int[] arreglo = {5, 8, 9, 3, 0};
        mO.sortBubbleAva(arreglo);
        mO.printArreglo(arreglo);

    }
}
