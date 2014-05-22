import java.io.*;
import java.util.*;
/*
MATTHEW COOK
APCS2 pd9
HW41
2014-05-14

the big-O of the memory of the Heapsort is O(n)
*/
public class Heapsort {
    public Integer[] sort(Integer[] data){
	ALHeap a = new ALHeap();
	for (Integer i : data) {
	    a.add(i);
	}
	int q =0;
	while (a.isEmpty() == false){
	    data[q] = a.removeMin();
	    q= q+1;
	}
	return data;
    }
    public static void main (String[] args){
	Integer[] d = { 5,4,13,57,6,8,12,100};
	Heapsort h = new Heapsort();
	System.out.println(Arrays.toString(h.sort(d)));
    }
}
