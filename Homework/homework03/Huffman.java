// class Huffman.java
// demonstrates huffman encoding
// to run this program: C>java Huffman
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*; // importing java.util packages

public class Huffman {
	public static Map<Character, String> map = new HashMap<>(); // referencing HashMap implementation found on StackExchange
	static HuffmanNode root;

//------------------------------------------------------------------------------------------------------------------------
	public static HuffmanNode buildTree(Map<Character, Integer> count) {
		PriorityQueue<HuffmanNode> que = new PriorityQueue<>();	// creaing PriorityQueue
		Set<Character> key = count.keySet();										// creating a keySet
		for (Character c : key) {
			HuffmanNode node = new HuffmanNode();									// creating huffman nodes
			node.count = count.get(c);														// counter to measure frequency of character in string
			node.letter = c;																			// setting character values in string to c
			node.right = null;
			node.left = null;
			que.offer(node);																			// inserting specified element into the queue
		}
		assert que.size() > 0;																	// checking if size is greater than 0, will spit error if false
		while (que.size() > 1) {
			HuffmanNode y = que.peek();														// returning element at front of queue setting equal to y
			que.poll();																						// returning and removing element at front of queue
			HuffmanNode x = que.peek();														// returning element at front of queue setting equal to x
			que.poll();																						// returning and removing element at front of queue
			HuffmanNode sum = new HuffmanNode();									// create new parent node of left and right child
			sum.count = (y.count + x.count);											// count of new parent node
			sum.right = y;
			sum.left = x;
			root = sum;
			que.offer(sum);																				// inserting sum element into the queue
		}
		return que.poll();
	} // end method buildTree()

//-------------------------------------------------------------------------------------------------------------------------
// Method to encode string inputted using 0s and 1s
	public static String encode(String input) {
		Map<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (!count.containsKey(input.charAt(i))) {
				count.put(input.charAt(i), 0);
			}
			count.put(input.charAt(i), count.get(input.charAt(i)) + 1);
		}
		System.out.println("\nHuffman Table: " + count);
		root = buildTree(count);
		bitCodes(root, new StringBuilder());
		System.out.println("\nValues encoded from characters: " + map);
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {										// incrementing through
			char c = input.charAt(i);																		// Establishing the character
			s.append(map.get(c));																			  // appending to the String Builder
		}
		return s.toString();
	} // end method encode()

//-------------------------------------------------------------------------------------------------------------------------
// Method to decode given bits of 0s and 1s
	public static void decode(String s) {
		StringBuilder string = new StringBuilder();
		HuffmanNode t = root;																// creating temporary node setting equal to root
		System.out.println("\nEncoded message is: " + s);
		for (int i = 0; i < s.length(); i++) {							// increment through
			int j = Integer.parseInt(String.valueOf(s.charAt(i)));
			if (j == 1) {																			// checking if value j is 1
				t = t.right;																		// temp goes to right node
				if (t.left == null && t.right == null) {				// checking if node == leaf node
					string.append(t.letter);											// appending letter char value
					t = root;
				}
			}
			if (j == 0) { 																		// checking if value j is 0
				t = t.left;																			// temp goes to left node
				if (t.left == null && t.right == null) { 				// checking if node == leaf node
					string.append(t.letter);											// appending letter char value
					t = root;
				}
			}
		}
		System.out.println("\nDecoded message is: " + string.toString());
	} // end method decode()

//-------------------------------------------------------------------------------------------------------------------------
// Method to append 1 or 0 prefixes during Encoding
	public static void bitCodes(HuffmanNode h, StringBuilder bit) {
		if (h != null) {
			if (h.left == null && h.right == null) {	// checking if node == leaf node
				map.put(h.letter, bit.toString());
			} else {
				bit.append('1');												// Appending 1
				bitCodes(h.right, bit);								 	// Passing in node and new StringBuilder
				bit.deleteCharAt(bit.length() - 1);			// adjusting the length
				bit.append('0');												// Appending 0
				bitCodes(h.left, bit);									// Passing in node and new StringBuilder
				bit.deleteCharAt(bit.length() - 1);   	// adjusting the length
			}
		}
	} // end method bitCodes()
} // end class Huffman

//-------------------------------------------------------------------------------------------------------------------------
