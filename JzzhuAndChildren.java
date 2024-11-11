import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JzzhuAndChildren {
    static class Child {
        int index;
        int candiesNeeded;

        Child(int index, int candiesNeeded) {
            this.index = index;
            this.candiesNeeded = candiesNeeded;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Queue<Child> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int candiesNeeded = scanner.nextInt();
            queue.add(new Child(i + 1, candiesNeeded));
        }

        int lastChildIndex = -1;

        while (!queue.isEmpty()) {
            Child currentChild = queue.poll();
            currentChild.candiesNeeded -= m;

            if (currentChild.candiesNeeded > 0) {
                queue.add(currentChild);
            } else {
                lastChildIndex = currentChild.index;
            }
        }

        System.out.println(lastChildIndex);
        scanner.close();
    }
}
