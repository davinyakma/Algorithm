#include <stdio.h>

int main()
{
	int a,b = 0;
	int b_1, b_2, b_3 = 0;
	scanf("%d %d", &a, &b);
	b_1 = b / 100, b_2 = (b % 100) / 10, b_3 = b % 10;
	printf("%d\n%d\n%d\n%d", a*b_3, a*b_2, a*b_1, a * b_3+ a * b_2*10 + a * b_1*100);
	return 0;
}