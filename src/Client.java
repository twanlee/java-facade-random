import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        RandomListFacade randomListFacade = new RandomListFacade(size);
        randomListFacade.filter();
    }
}
