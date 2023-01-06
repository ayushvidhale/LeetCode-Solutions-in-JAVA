public class SmallestLetter {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class smallestLetter {

        public static void main(String[] args) {

        }
        public char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;
            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (target < letters[mid]) {
                    end = mid - 1;
                } else if (target > letters[mid]) {
                    start = mid + 1;
                }
            }

            return letters[start % letters.length];

        }
    }
}