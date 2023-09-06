import java.util.Scanner;

public class CalculacionIVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Precio del producto:");
        float precioInicial = scanner.nextFloat();

        System.out.println("Tipo de IVA\n0- General\n1- Reducido\n2- SuperReducido\n3- Extento");
        int tipoDeIVA = scanner.nextInt();

        float precioFinal = calcularPrecioFinal(precioInicial, tipoDeIVA);
        System.out.printf("Precio final: %.1f",  precioFinal);
    }

    public static float calcularPrecioFinal(float precioInicial, int tipoDeIVA) {
        final float IVA_GENERAL = 0.21F;
        final float IVA_REDUCIDO = 0.10F;
        final float IVA_SUPER_REDUCIDO = 0.04F;
        final float IVA_EXTENTO = 0F;

        return switch (tipoDeIVA) {
            case 0 -> precioInicial + precioInicial * IVA_GENERAL;
            case 1 -> precioInicial + precioInicial * IVA_REDUCIDO;
            case 2 -> precioInicial + precioInicial * IVA_SUPER_REDUCIDO;
            case 3 -> precioInicial + precioInicial * IVA_EXTENTO;
            default -> throw new IllegalStateException("Tipo de IVA inesperado: %d".formatted(tipoDeIVA));
        };
    }
}
