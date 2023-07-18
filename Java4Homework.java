import java.util.*;

public class Java4Homework {
    static class List1 {
        int val;
        List1 next;

        List1() {
        }

        List1(int val) {
            this.val = val;
        }

        List1(int val, List1 next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Deque<Integer> deque1 = new LinkedList<>();
        deque1.addLast(3);
        deque1.addLast(4);
        deque1.addLast(2);

        Deque<Integer> deque2 = new LinkedList<>();
        deque2.addLast(4);
        deque2.addLast(6);
        deque2.addLast(5);

        List1 result1 = multiplyDeque(deque1, deque2);
        while (result1 != null) {
            System.out.print(result1.val + " ");
            result1 = result1.next;
        }
        System.out.println();

        Deque<Integer> deque3 = new LinkedList<>();
        deque3.addLast(3);
        deque3.addLast(4);
        deque3.addLast(2);

        Deque<Integer> deque4 = new LinkedList<>();
        deque4.addLast(-5);
        deque4.addLast(6);

        List1 result2 = addDeque(deque3, deque4);
        while (result2 != null) {
            System.out.print(result2.val + " ");
            result2 = result2.next;
        }
    }

    public static List1 multiplyDeque(Deque<Integer> deque1, Deque<Integer> deque2) {
        if (deque1.isEmpty() || deque2.isEmpty()) {
            return null;
        }

        List1 result = new List1();
        List1 current = result;
        int carry = 0;

        while (!deque1.isEmpty()) {
            int digit = deque1.removeLast();
            Deque<Integer> temp = new LinkedList<>(deque2);
            carry = 0;

            while (!temp.isEmpty()) {
                int multiplier = temp.removeLast();
                int product = digit * multiplier + carry;

                if (current.next != null) {
                    current.next.val += product % 10;
                    carry = product / 10;
                } else {
                    current.next = new List1(product % 10);
                    current = current.next;
                    carry = product / 10;
                }
            }

            while (carry > 0) {
                current.next = new List1(carry % 10);
                current = current.next;
                carry /= 10;
            }
        }

        return result.next;
    }

    public static List1 addDeque(Deque<Integer> deque1, Deque<Integer> deque2) {
        if (deque1.isEmpty() && deque2.isEmpty()) {
            return null;
        }

        List1 result = new List1();
        List1 current = result;
        int carry = 0;

        while (!deque1.isEmpty() || !deque2.isEmpty()) {
            int sum = carry;

            if (!deque1.isEmpty()) {
                sum += deque1.removeLast();
            }

            if (!deque2.isEmpty()) {
                sum += deque2.removeLast();
            }

            current.next = new List1(sum % 10);
            carry = sum / 10;
            current = current.next;
        }

        if (carry > 0) {
            current.next = new List1(carry);
        }

        return result.next;
    }
}