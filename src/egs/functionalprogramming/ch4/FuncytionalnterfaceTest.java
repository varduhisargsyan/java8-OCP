package egs.functionalprogramming.ch4;
import java.util.Arrays;
import java.util.function.Function;
import java.util.List;


public class FuncytionalnterfaceTest {
	
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(1,2,2,23,4,565);
		integers.forEach(integer-> System.out.println(integer));
	}

}
