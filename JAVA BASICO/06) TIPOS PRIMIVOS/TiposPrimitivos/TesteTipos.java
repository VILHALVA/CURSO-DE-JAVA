package TiposPrimitivos;

public class TesteTipos {
    public static void main(String[] args) {
        // CONVERTENDO INT PARA STRING.
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.print(valor);

        // CONVERTENDO STRING PARA INT.
        String num = "50";
        int numero = Integer.parseInt(num);
        System.out.print(numero);

        // CONVERTENDO STRING PARA FLOAT.
        String numF = "50.89";
        int numeroF = Float.parseFloat(numF);
        System.out.print(numeroF);
    }   
}
