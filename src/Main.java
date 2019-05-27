public class Main {
    public static void main(String[] args) {
        String input="jwtviwfgsa";
        try {
            if (input.contains("1")){
                throw new StringFormatExeption();
            }
        }
        catch (StringFormatExeption ex){
            System.out.println("შემოტანილი სტრიქონი შეიცავს 1-ს");
        }
    }
}