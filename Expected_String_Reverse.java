package Core_Java;
import java.util.Scanner;

public class Expected_String_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter first,second,lastnames");
		String full_names=sc.nextLine();
		String[]full_namesArray=full_names.split("\\s");
		String first=full_namesArray[0];
		String second=full_namesArray[1];
		String third=full_namesArray[2];
		String second_reverse=new StringBuilder(second).reverse().toString();
		System.out.println("the first name is:"+first);
		System.out.println("the second name is:"+second);
		System.out.println("the third name is:"+third);
	}

}
