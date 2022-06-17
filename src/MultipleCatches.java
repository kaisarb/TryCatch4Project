class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a;
            a = args.length;
            System.out.println(" a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[4] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Ошибка индексации за пределами массива : " + e);
        }
        System.out.println("После блока операторов try/catch . ");
        try {
            throw new NullPointerException("NPE");
        }
        catch (NullPointerException e) {
            System.out.println("Exception throwed and catched " + e);
        }
    }
}