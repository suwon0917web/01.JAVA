package ��Ʈ����;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2StreamDemo {

	public static void main(String[] args) {

        int[] ia = {5, 7, 11, 13,2,3};
        IntStream is = Arrays.stream(ia);

        String[] strings = {"The", "pen", "is", "mighter", "than", "the", "sword"};
        Stream<String> ss =
                Stream.of(strings);

        double[] da = {1.2, 3.14, 5.8, 0.2};
        DoubleStream ds = DoubleStream.of(da);
        
        // 1. ��Ʈ�� ��ü is��  ���
//        is.forEach(x->System.out.print(x + " "));
        // 2. �����ؼ� ���
//        is.sorted().forEach(x->System.out.print(x+" "));
        // 3. 5����ū���� ���
        is.filter(x->x>5).forEach(x->System.out.print(x+ " "));
    }
}
