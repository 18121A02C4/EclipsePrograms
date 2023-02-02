import java.util.Arrays;
import java.util.Scanner;
public class JaggedArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] arr2d=new int[4][];
		arr2d[0]=new int[1];//specify the no of columns for each array
		arr2d[1]=new int[2];
		arr2d[2]=new int[3];
		arr2d[3]=new int[4];
		for(int r=0;r<arr2d.length;r++) {
			for(int c=0;c<arr2d[r].length;c++) {
				arr2d[r][c]=sc.nextInt();
			}
		}
		for(int[] i:arr2d) {
			System.out.println(Arrays.toString(i));
		}
		for(int r=0;r<arr2d.length;r++) {
			for(int c=0;c<arr2d[r].length;c++) {
				System.out.print(arr2d[r][c]+" ");
			}
			System.out.println();
		}

	}

}
/*input:
1
2 3
4 5 6
7 8 9 10
output:
[1]
[2, 3]
[4, 5, 6]
[7, 8, 9, 10]
1
23
456
78910
*/
