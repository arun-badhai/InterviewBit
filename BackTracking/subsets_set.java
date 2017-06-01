# Subsets of a set

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static Set<ArrayList<Integer>> set = new HashSet<>();
	static int[] array = new int[]{1,2,3};
	public static void Subset(int a){
		if(a<=array.length){
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=a;j<array.length;j++){
				list.add(array[j]);
			}
			Collections.sort(list);
			if(!set.contains(list)){
				set.add(list);
			}
		}
		for(int j=a;j<array.length;j++){
			swap(a, j);
			Subset(a+1);
			swap(a, j);
		}
	}
	public static void swap(int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Subset(0);
		System.out.println(Arrays.toString(Flist.toArray()));
	}
}