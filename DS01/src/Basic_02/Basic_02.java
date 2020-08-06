package Basic_02;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class Basic_02 {
	
	public static void main(String[]args) {
		
		//file path
		Path filePath = Paths.get("D:\\WorkSpace\\Data-Structure_Java\\DS01\\src\\resorces\\input.txt");
		
		//scanner init
		Scanner scanner = null; 
		try {
			//carate scanner object
			scanner = new Scanner(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//careate List objcet
		List<Integer> nums = new ArrayList<>();
		
		//get value 
		//hasnext next string -> true nomore string -> false
		while (scanner.hasNext()) {
		    if (scanner.hasNextInt()) {
		        nums.add(scanner.nextInt());
		    } else {
		        scanner.next();
		    }
		}
		
		FindMaxMin(nums);

	}
	
	public static void FindMaxMin(List<Integer> temp)
	{
		for(int i= 0;i<temp.size();i++)
		{
			System.out.print(temp.get(i)+" ");
		}
		System.out.println("");
		//Sorting 
		Collections.sort(temp);
		
		int min= temp.get(0);
		int max= temp.get(temp.size()-1);
		
		System.out.println("Max : "+ max);
		System.out.println("Min : "+ min);
	}
}