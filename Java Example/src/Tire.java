public class Tire {
    static class Node{
        Node[] children;
        boolean endOfWord;
        public Node(){
            children = new Node[26];
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node();
    public static void insert(String[] words){
        Node curr = root;
        for(String word: words){
            for(int i = 0; i < word.length(); i++){
                int idx = word.charAt(i) - 'a';
                if(curr.children[idx] == null){
                    curr.children[idx] = new Node();
                }
                if (i == word.length() - 1){
                    curr.children[idx].endOfWord = true;
                }
                curr = curr.children[idx];
            }
        }
    }

    public static boolean search(String keys){
        Node curr = root;
        for(int i = 0; i < keys.length(); i++){
            int idx = keys.charAt(i) - 'a';
            Node node = curr.children[idx];
            if (node == null)
                return false;
            if (!node.endOfWord && i == keys.length() - 1)
                return false;

            curr = node;
        }

        return true;
    }

    public static void main(String[] args) {
//        String[] words = {"the", "a", "three", "their", "any"};
//        insert(words);
//        String[] keys = {"the", "an", "three", "their", "any"};
//        search(keys);
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};
        insert(words);
        System.out.println(search("i"));

    }
}
