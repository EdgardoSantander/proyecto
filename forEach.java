public class forEach {
    public static void main(String[] args) {
        SucesionNumeros("1","2","3");
        SucesionNumeros("4","5","6","7","8","9");
        SucesionNumeros("10");
        System.out.println("Ejemplo de un for mejorado, tambien llamado for-each, ademas tambien se ve el funcionamiento de \n" +
                "argumentos variables... que sirve para mandar varios datos sin necesidad de usar varias variables. ");
    }

    public static void SucesionNumeros(String... numeros){
        for (String num:numeros) {

            System.out.println("Valor: "+ num);
        }
    }
}