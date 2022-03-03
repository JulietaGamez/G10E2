package g10e2;

import Entidades.Electrodomestico;
import Servicio.ElectrodomesticoOrquesta;
import java.util.ArrayList;

public class G10E2 {

    public static void main(String[] args) {
        Electrodomestico electro = new Electrodomestico();
        ArrayList<Electrodomestico> listaElectros = new ArrayList();
        ElectrodomesticoOrquesta eO = new ElectrodomesticoOrquesta();
        listaElectros= eO.crearLista(listaElectros);
        eO.mostrarYsumarLista(listaElectros);
    }
}
