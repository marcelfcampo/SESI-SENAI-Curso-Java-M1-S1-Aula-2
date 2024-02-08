public class Array {
    public static void main(String[] args) {

        Double[] notas = new Double[4];
        notas[0] = 8.0;
        notas[1] = 7.0;
        notas[2] = 6.0;
        notas[3] = 5.0;

        System.out.println(notas[0]);


        for ( int index = 0; index < notas.length ; index++) {
            System.out.println(notas[index]);
        }
    }
}