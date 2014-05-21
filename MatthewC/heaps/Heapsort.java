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
    public Integer[] heapify(Integer[] data){
	int addValPos;
	int parentPos;
	Integer addVal=0;
	Integer temp=0;
	for ( int q = 0 ; q<data.length; q++){
	    addVal= data[q];
	    addValPos = q;
	    

	    while( addValPos > 0 ) { //potentially swap until reach root
		
		//pinpoint parent
		parentPos = (addValPos-1) / 2;
		
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
	    for (int i = 0; i <= q; i++) {
		
		System.out.print(data[i]+",");
		
	    }
	    System.out.println();
	}
	return data;
    }/*
        public Integer removeMin(int[] ) {

	if ( _heap.size() == 0 ) 
	    return null;

	//store root value for return at end of fxn
	Integer retVal = peekMin();

	//store val about to be swapped into root
	Integer foo = _heap.get( _heap.size() - 1);

	//swap last (rightmost, deepest) leaf with root
	swap( 0, _heap.size() - 1 );

	//lop off last leaf
	_heap.remove( _heap.size() - 1);

	// walk the now-out-of-place root node down the tree...
	int pos = 0;
	int minChildPos;

	while( pos < _heap.size() ) {

	    //choose child w/ min value, or check for child
	    minChildPos = minChildPos(pos);

	    //if no children, then i've walked far enough
	    if ( minChildPos == -1 ) 
		break;
	    //if i am less than my least child, then i've walked far enough
	    else if ( foo.compareTo( _heap.get(minChildPos) ) <= 0 ) 
		break;
	    //if i am > least child, swap with that child
	    else {
		swap( pos, minChildPos );
		pos = minChildPos;
	    }
	}
	//return removed value
	return retVal;
    }//O(logn)



    private int minChildPos( int pos ,Integer[] data) {
	int retVal;
	int lc = 2*pos + 1; //index of left child
	int rc = 2*pos + 2; //index of right child

	//pos is not in the heap or pos is a leaf position
	if ( pos < 0 || pos >= data.length|| lc >= data.length )
	    retVal = -1;
	//if no right child, then left child is only option for min
	else if ( rc >= data.length )
	    retVal = lc;
	//have 2 children, so compare to find least 
	else if ( data[lc].compareTo(data[rc]) < 0 )
	    retVal = lc;
	else
	    retVal = rc;
	return retVal;
    }//O(1)



    //************ aux helper fxns ***************
    private Integer minOf( Integer a, Integer b ) {
	if ( a.compareTo(b) < 0 )
	    return a;
	else
	    return b;
    }

    //swap for an ArrayList
    private void swap( int pos1, int pos2 ) {
	data[parentPos]=data[addValPos];
	data[addValPos]=temp;
	addValPos = parentPos;
    }
     */
    public static void main (String[] args){
	Integer[] d = { 5,4,13,57,6,8,12,3};
	Heapsort h = new Heapsort();
	Integer[] d1 = h.heapify(d);
	System.out.println(Arrays.toString(d1));
    }
}
