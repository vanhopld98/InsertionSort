public class insertionSort {
    static int[] list = {1, 9, 6, 5, 888, 11, 66, 545};

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Mảng khi chưa sắp xếp :");
        for (int element : list) {
            System.out.print(element + "\t");
        }
        System.out.println();
        insertionSort(list);
        System.out.println("Mảng khi sắp xếp :");
        for (int element : list) {
            System.out.print(element + "\t");
        }
    }
}
