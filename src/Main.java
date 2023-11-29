
public class Main {
    public static void main(String[] args) {
    int[] list={15,12,788,1,-1,-788,2,0};
    int min=list[0];
    int max=list[0];
    for (int i:list){
        if (i < min ) {
            min=i;
        }
        if (i>max){
            max=i;
        }
    }
    System.out.println("minimum değeri: " + min);
    System.out.println("maximum değeri: " + max);


}

}