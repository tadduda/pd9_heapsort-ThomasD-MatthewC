import java.io.*;
import java.util.*;
/*
MATTHEW COOK
APCS2 pd9
HW42
2014-05-21

the big-O of the memory of the Heapsort is O(1)
I did it by sort of using a partition to make a heap out of the right 
part of the array. Since we know the first element in a minheap is the 
minimum, we can just continue to "heapify" the heap and shift overeach
time, continuing to modify the current array instead of making copies.
*/


public class Heapsort {
    public Integer[] heapify(Integer[] data, int ind){
	int addValPos;
	int parentPos;
	Integer addVal=0;
	Integer temp=0;
	for ( int q = ind ; q<data.length; q++){
	    addVal= data[q];
	    addValPos = q;
	    

	    while( addValPos > ind ) { //potentially swap until reach root
		
		//pinpoint parent
		parentPos = ((addValPos+ind-1) / 2);
		System.out.println(addVal + "<" + data[parentPos] + "   ppos:" +parentPos + "   aVPOs: " + addValPos);
		if ( addVal.compareTo(data[parentPos]) < 0 ) {//addVal < parent
		    System.out.println("heyea");
		    temp=data[parentPos];
		    System.out.println(temp);
		    data[parentPos]=data[addValPos];
		    data[addValPos]=temp;
		    addValPos = parentPos;
		}
		else 
		    break;
	    }
	    System.out.println();
	    for (int i = 0; i < data.length; i++) {
		
		System.out.print(data[i]+",");
		
	    }
	    System.out.println();
	}
	return data;
	
    }
    
    public Integer[] sort(Integer[] data){
	data=heapify(data,0);
	for (int z =0; z<data.length-1; z++){
	    
	    System.out.println(Arrays.toString(data));
	    data=heapify(data,z+1);
	}
	return data;
    }

    public static void main (String[] args){
	Integer[] d = { 5,4,13,57,6,8,12,3};
System.out.println(Arrays.toString(d));
	Heapsort h = new Heapsort();
	Integer[] d1 = h.sort(d);
	System.out.println(Arrays.toString(d1));
    }
}
