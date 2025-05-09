public class Main {

    // 三角形を表示するメソッド
    public static void showTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // メインメソッド：ここから実行されます
    public static void main(String[] args) {
        showTriangle(5);  // 5段の三角形を表示
    }
}
