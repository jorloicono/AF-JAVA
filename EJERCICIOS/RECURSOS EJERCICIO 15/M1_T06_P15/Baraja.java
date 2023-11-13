package M1_T06_P25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
	
	public static final String[] numeros ={"AS", "DOS", "TRES", "CUATRO",
            "CINCO", "SEIS", "SIETE", "SOTA", "CABALLO", "REY"};
    public static final String[] palos ={"ESPADAS", "COPAS", "BASTOS", "OROS"};
    private List cartas = new ArrayList();

    public Baraja() {
        for (String palo : palos) {
            for (String numero : numeros) {
                cartas.add(new Carta(numero, palo));
            }
        }
    }

    public Carta getCarta(int posicion) {
        return (Carta)cartas.get(posicion);
    }

    public Mazo getMazo() {
        List cartasAux = new ArrayList(cartas);
        Collections.shuffle(cartasAux);
        Mazo m = new Mazo();
        for (Object carta : cartasAux) {
            m.anadirCarta((Carta)carta);
        }
        return m;
    }
}


