public class EstructuraControl {
    public static void main(String[] args) {
        // ex 1
        int nota = 5;

        if(nota > 5) {
            System.out.println("Has aproado");
        } else if (nota == 5) {
            System.out.println("Aprovado por los pelos");
        }
        else
        {
            System.out.println("Has suspendido");
        }

        // ex 2
        int i = 7;

        String resultado = (i%2==0)?"i es par":"i es impar";
        System.out.println(resultado);
    }
}
