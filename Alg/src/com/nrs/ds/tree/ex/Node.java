package com.nrs.ds.tree.ex;

public class Node {
	String data;
	Node left, right, nextRight;
	Node(String string){
		data = string;
		left=right=nextRight=null;
	}

}
