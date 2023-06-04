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
        for(String word: words){
            Node curr = root;
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

    public static boolean wordBreak(String key){
        if (key.length() == 0)
            return true;

        for(int i = 1; i <= key.length(); i++){
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);
            if (search(firstPart) && wordBreak(secPart)){
//                System.out.println(firstPart);
                return true;
            }
        }
        return false;
    }

    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            Node node = curr.children[idx];
            if (node == null)
                return false;
            curr = node;
        }
        return true;
    }

    public static int countNode(Node root){
        if (root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
//        String[] words = {"the", "a", "three", "their", "any"};
//        insert(words);
//        String[] keys = {"the", "an", "three", "their", "any"};
//        search(keys);
//        String[] words1 = {"i", "like", "sam", "samsung", "mobile", "ice"};
//        insert(words1);
//        for(String word: words){
//            System.out.println(word + " : " + search(word));
//        }

//        String key = "ilikesamsung";
//        System.out.println(wordBreak(key));
//        String[] words = {"apple", "app", "mango", "man", "woman"};
//        insert(words);
//        String prefix = "app";
//        System.out.println( prefix + " : " + startWith(prefix));



        // Substring = all unique prefix of all suffix
        // total numbers of tire == count of unique prefix
        String str = "ababa";
        String[] suffix = new String[str.length() + 1];
        // find suffix of 'str'
        for (int i = 0; i < str.length() + 1; i++){
            suffix[i] = str.substring(i);
            if (i == str.length()){
                suffix[i] = "";
            }
        }
        insert(suffix);
        System.out.println(countNode(root));
    }
}
