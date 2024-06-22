public class Main {
    public static void main(String[] args) {
        Auto miaAuto = new Auto(1.6, "AB123CD", "Fiat", "Panda");

        System.out.println("La mia auto è una " + miaAuto.getMarca() + " " + miaAuto.getModello() + " con cilindrata " + miaAuto.getCilindrata() + " e targa " + miaAuto.getTarga());
    }
}