
public class MultiDimensionalArray {

	public static void main(String[] args) {
    int[][] a={{20,25,8,97},{80,99,76,65},{46,65,22,34,45,66}};
    for(int i=0;i<a.length;i++){
    	for( int j=0;j<a[i].length;j++){
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    }

	}

}
