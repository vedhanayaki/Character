package player;
import java.util.Scanner;
public class CounttheCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Word:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int count=0;
for(int i=0;i<a.length();i++){
	char b=a.charAt(i);
	if(b=='$'){
		count++;
	}
}
	}

}
