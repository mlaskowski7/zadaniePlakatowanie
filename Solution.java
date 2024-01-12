import java.util.Scanner;
import java.util.Stack;

public class Solution {

    static int countPosters(int n, int[][] buildings){
        if(n == 0){
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() > buildings[i][1] ) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() < buildings[i][1] ) {
                stack.push(buildings[i][1]);
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        // Main variables declaration
        int n;
        int[][] buildings;


        // Input loading
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        buildings = new int[n][2];
        for (int i = 0; i < n; i++) {
            buildings[i][0] = scanner.nextInt();
            buildings[i][1] = scanner.nextInt();
        }

        // Output
        System.out.println(countPosters(n,buildings));




    }

}
