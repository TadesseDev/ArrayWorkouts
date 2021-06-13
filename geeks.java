public class geeks {
    public static void main(String... arg) {
        geeks caller = new geeks();
        System.out.println(caller.presentInEverySegment(new int[] { 5, 8, 7, 12, 14, 3, 9},8,2));   
    }

    boolean presentInEverySegment(int[] a, int x, int k) {
        int i = 0;
        while (i < a.length) {
            boolean found = false;
            for (int segment = 0; segment < k && i < a.length; segment++, i++) {
                if (a[i] == x)
                    found = true;
            }
            if (!found)
                return false;
        }
        return true;
    }
}