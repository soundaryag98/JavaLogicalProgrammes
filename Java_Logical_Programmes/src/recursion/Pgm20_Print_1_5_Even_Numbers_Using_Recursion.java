package recursion;

public class Pgm20_Print_1_5_Even_Numbers_Using_Recursion {
public static void main(String[] args) {
	disp(1);
}

static void disp(int i) {
if(i<=5) {
	if(i%2==0) {
	System.out.println(i);
	}
	i++;
	disp(i);
}
}
}
