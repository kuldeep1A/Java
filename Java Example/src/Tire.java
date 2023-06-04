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

    public static void search(String[] keys){
        Node curr = root;
        for(String key: keys){
            boolean exist = true;
            for(int i = 0; i < key.length(); i++){
                int idx = key.charAt(i) - 'a';
                Node node = curr.children[idx];
                if(node == null){
                    exist = false;
                    break;
                }
                if(!node.endOfWord && i == key.length() - 1){
                    exist = false;
                    break;
                }
                curr = node;
            }
            System.out.println(key + " is " + exist);
        }
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "three", "their", "any"};
        insert(words);
        String[] keys = {"the", "an", "three", "their", "anyd"};
        search(keys);
    }
}
