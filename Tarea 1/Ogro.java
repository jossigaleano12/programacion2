package gt.edu.miumg.tarea1;

public abstract class Ogro extends Personaje implements villano{

    @Override
    public void desplazarse() {

    }

    @Override
    public void mostrarPoder() {

    }

    @Override
    public int mostrarVida() {
        return 0;
    }

    @Override
    public void atacar() {

    }

    @Override
    public void destruir() {

    }

    public Ogro(String nombre, String descripcion, long tamaño, int vida, int poder) {
    }
}
