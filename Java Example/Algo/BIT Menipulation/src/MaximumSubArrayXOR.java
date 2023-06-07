/**
 * In this implementation, we use a Trie data structure to store the prefix XOR values. The TrieNode class
 * represents a node in the Trie, and the Trie class represents the Trie itself. The insert method is used
 * to insert a number into the Trie, and the findMaxXOR method finds the maximum XOR value of a number in
 * the Trie. The findMaximumSubarrayXOR function takes an array of numbers (nums) as input and returns the
 * maximum XOR value of a subarray. It iterates over the input array, calculates the prefix XOR value up to
 * the current element, inserts it into the Trie, and finds the maximum XOR value using the findMaxXOR method.
 * Finally, it returns the maximum XOR value of a subarray. In the example main method, we have an
 * array [3, 10, 5, 25, 2, 8].
 */


