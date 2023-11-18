public class array1{
public static void main(String[] args) {
    int [] array= {1,2,3,4,5,6,7}
    int i =4;
    while(i < array.length){
        System.out.printIn("The value of array" +array[i]);
        i--;
    }
}
}

scanner input = new scanner(System.in);
int [ ] num = new int[7];
int i = 0;
while(i<7){
    System.out.printf ("input number of num ["+i+"]");
    num [i]=input.nextInt();
    i++;
}
i = 0;
while(i < num.length) {
    System.out.printIn(num[i]);
    i++;
}



public class array1{
public static void main(String[] args) {
    int [] array= {1,2,3,4,5,6,7}
    int i =0;
    while(i < array.length){
        System.out.printIn("input element of num[i]" +array[i]);
        i--;
    }
    int[] array= {1,2,3,4,5,6,7}
    int z =0;
    while (z < num.length){
        System.out.printIn (z);
        i++;
    }
    int i =4;
    while(i < -1) {
        System.out.printIn(i);
        i--;
    }
    float sum =0;
    int x =0;
    while (x < num.length) {
        sum += array[x];
        x++;
    }
    System.out.printIn("the sum is: " + sum);
    float average = sum/num.length;
    System.out.printIn("the average is: " + average)
}
}

j
4444444444444444444444
int[] sourceArray = (2, 3, 1, 5, 10);
int[] targetArray = new int[sourceArray.length];
int i = 0;
while (i < sourceArray.length) {
    targetArray[i] = sourceArray [i];
    i++;
}