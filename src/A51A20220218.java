import java.io.*;
import java.util.*;

public class A51A20220218 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = br.readLine();
		String arr[] = a.split(" ");
		int arr2[] = new int[Integer.parseInt(arr[1]) + 1];
		int buf = 0, k = 0;
		int count = 0;
		int count3 = 0;
		int q = Integer.parseInt(arr[0]);
		String sr[] = new String[Integer.parseInt(arr[1]) + 1];

		for (int i = Integer.parseInt(arr[0]); i <= Integer.parseInt(arr[1]); i++) {
			arr2[i] = q;

			if (arr2[i] == 1) {
				q++;
				continue;

			}
			if (arr2[i] == 2 && arr[2].equals("2")) {
				q++;
				count++;
				continue;
			}
			buf = arr2[i] - 1;

			for (int j = buf; j > 1; j--) {
				if (arr2[i] % buf == 0) {
					count3++;
				}

				if (buf == 2 && count3 == 0) {
					int temp = i;
					while (temp != 0) {
						if (temp % 10 == Integer.parseInt(arr[2])) {
							count++;
							break;
						}
						temp /= 10;
					}
				}

				buf--;
			}
			q++;
			count3 = 0;

		}

		bw.write(Integer.toString(count));
		bw.close();
		br.close();
	}
}

/*
 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                int temp = i;

                while (temp != 0) {
                    if (temp % 10 == D) {
                        ans++;
                        break;
                    }
                    temp /= 10;
                }
            }
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
 */
 
