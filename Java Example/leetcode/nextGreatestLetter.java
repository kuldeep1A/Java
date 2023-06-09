public class nextGreatestLetter {
    public static char nextGreatestLetter1(char[] letters, char target){
        char answer = ' ';
        if (target >= letters[letters.length - 1] || target < letters[0])
            return letters[0];

        int left = 0;
        int right = letters.length - 1;
        while(left <= right){
            int mid = left + (right - left);
            if(letters[mid] <= target){
                left = mid + 1;
            } else {
                answer = letters[mid];
                right = mid - 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'k', 'm'};
        char target = 'j';
        System.out.println(nextGreatestLetter1(letters, target));
    }
}
