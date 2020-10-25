public class Lambda {
    public static void main(String[] args) {
        FunctionalInterface ref = (str) -> {

            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        // вызов метода из интерфейса
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }
}
