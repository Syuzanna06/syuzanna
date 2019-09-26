package things;


public class Things {

    static int[] values = new int[] {23, 26, 59, 69, 27};
static int[] weights = new int[] {15, 3, 9, 4, 21};
static int W = 30;

private static int otbor(int i, int W) {
    if (i < 0) {
        return 0;
    }
    if (weights[i] > W) {
        return otbor(i-1, W);
    } else {
        return Math.max(otbor(i-1, W), otbor(i-1, W - weights[i]) + values[i]);
    }
}

public static void main(String[] args) {
System.out.println("Наибольшая ценность вещей в рюкзаке = " + otbor(values.length - 1, W));}
}

