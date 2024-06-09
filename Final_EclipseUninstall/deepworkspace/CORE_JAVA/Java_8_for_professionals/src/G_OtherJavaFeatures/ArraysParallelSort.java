package G_OtherJavaFeatures;

import java.util.Arrays;
import java.util.Random;

public class ArraysParallelSort {

	public static void main(String[] args) {
		
		int[] simpleArr1 = new int[10000];
		int[] simpleArr2 = new int[10000];
		
		Random random= new Random();
		
		for (int i = 0; i < simpleArr2.length; i++) {
			simpleArr1[i]= random.nextInt();
		}
		
		for (int i = 0; i < simpleArr2.length; i++) {
			simpleArr2[i]= random.nextInt();
		}
		
		long seqArrStartTime= System.currentTimeMillis();
		Arrays.parallelSort(simpleArr1);
		long seqArrEndTime= System.currentTimeMillis();
		long seqArrTotalTime = seqArrEndTime-seqArrStartTime;
		System.out.println("Sequential takes: "+seqArrTotalTime);
		
		long parArrStartTime= System.currentTimeMillis();
		Arrays.sort(simpleArr2);
		long parArrEndTime= System.currentTimeMillis();
		long parArrTotalTime = parArrEndTime-parArrStartTime;
		System.out.println("Parallel takes: "+parArrTotalTime);
		
		

	}

}
