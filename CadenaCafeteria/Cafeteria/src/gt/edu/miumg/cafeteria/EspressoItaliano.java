package gt.edu.miumg.cafeteria;

public class EspressoItaliano extends Cafe{
    private int intensidad;

    public EspressoItaliano (int intensidad, int tamaño, double precio){
        super("Espresso Italiano", tamaño, precio);
        this.intensidad = intensidad;
        ingredientes.add(new Grano("Italiano"));
        ingredientes.add(new Agua(50));
        ingredientes.add(new Leche("entera", 10));
    }

    @Override
    public String toString() {
        return "EspressoItaliano{" +
                "intensidad=" + intensidad +
                ", ingredientes=" + ingredientes +
                "}";
    }
}
