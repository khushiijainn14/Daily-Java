//Before the outbreak of coronavirus, a meeting happened in Wuhan. There were N people in the room, and every person shook hands with every other person exactly once.
//Given N, find the total number of handshakes that happened.


import java.util.*;

public class hanshake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();

            long handshakes = N * (N - 1) / 2;

            System.out.println(handshakes);
        }

        sc.close();
    }
}