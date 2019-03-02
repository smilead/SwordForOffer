package org.smilead.swordoffer.problem054;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem054 {
	HashMap<Character, Integer> map = new HashMap<>();
	ArrayList<Node> list = new ArrayList<>();
	int firstIndex = 0;
	//Insert one char from stringstream
    public void Insert(char ch){
    	if(map.get(ch) == null) {
    		list.add(new Node(ch));
    		map.put(ch, list.size()-1);
    	}else {
    		Node node= list.get(map.get(ch));
    		node.first = false;
    	}
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
    	char result = '#';
    	for(int i = firstIndex;i<list.size();i++) {
    		if(list.get(i).first) {
    			firstIndex = i;
    			result = list.get(i).value;
    			break;
    		}
    	}
    	return result;
    }
    
}
class Node{
	char value ;
	boolean first = true;
	public Node(char ch) {
		this.value = ch;
	}
}
