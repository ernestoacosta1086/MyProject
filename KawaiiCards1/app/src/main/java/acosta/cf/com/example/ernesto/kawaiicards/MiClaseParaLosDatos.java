package acosta.cf.com.example.ernesto.kawaiicards;

/**
 * Created by Ernesto on 23/12/2015.
 */
public class MiClaseParaLosDatos {
    private int imagen;
    private String nombre;
    private int visitas;

    public MiClaseParaLosDatos(int imagen, String nombre, int visitas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.visitas = visitas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVisitas() {
        return visitas;
    }

    public int getImagen() {
        return imagen;
    }
}
