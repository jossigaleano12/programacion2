package gt.edu.miumg.cafeteria;

public class cafeColombiano extends Cafe{
    private String tipoGrano;

    public cafeColombiano(String tipoGrano, int tamaño, double precio) {
        super("Cafe Colombiano", tamaño, precio);
        this.tipoGrano = tipoGrano;
        ingredientes.add(new Grano("tostado"));
        ingredientes.add(new Agua(100));
    }
}
