import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Fiesta {
    public static void main(String[] args) {
        ArrayList<String> listaDeInvitados = new ArrayList<>(Arrays.asList("Albert", "Amelia", "Ava", "Carlos", "Charlotte", "David", "Eva", "Isabel", "Javier", "Maria", "Mia", "Olivia", "Pau", "Rosa", "Sofia"));

        System.out.println();

        listaDeInvitados.remove("Carlos");
        listaDeInvitados.remove("Eva");

        listaDeInvitados.sort(Comparator.naturalOrder());
        System.out.println(listaDeInvitados);
        System.out.println(listaDeInvitados.get(listaDeInvitados.size() - 1));

        listaDeInvitados.add(2, "Marga");

        listaDeInvitados.sort(Comparator.naturalOrder());
        System.out.println(listaDeInvitados);

        listaDeInvitados.add("Oscar");
        listaDeInvitados.add("Felipe");

        listaDeInvitados.sort(Comparator.naturalOrder());
        System.out.println(listaDeInvitados);

        listaDeInvitados.set(listaDeInvitados.indexOf("Rosa"), "Carla");

        listaDeInvitados.sort(Comparator.naturalOrder());
        System.out.println(listaDeInvitados);

        listaDeInvitados.remove("Albert");

        listaDeInvitados.sort(Comparator.naturalOrder());
        System.out.println(listaDeInvitados);
    }
}
