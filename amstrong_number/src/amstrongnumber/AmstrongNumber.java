package amstrongnumber;

public class AmstrongNumber {

	public static void main(String[] args) {
        int n, b,sum = 0;
        System.out.print("Amstrong numbers between 1-500 are:");

        for(int i = 1; i <= 500; i++)

        {

            n = i;

            while(n > 0)

            {

                b = n % 10;

                sum = sum + (b * b * b);

                n = n / 10;

            }

            if(sum == i)

            {

                System.out.print("\n"+i);

            }

            sum = 0;

        }
	}

}
