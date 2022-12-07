public class program {
    public static void main(String[] args) throws Exception{
        int version = view.version();
        if (version == 1) {
            System.out.printf("Результат равен: %.2f",controller.keyboard());
        } if (version == 2) {
            System.out.printf("Результат равен: %.2f",controller.fromFile());
            controller.writeFile();
        }

    }
}