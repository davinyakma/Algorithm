#include <stdio.h>

int main()
{
	int year = 0;
	scanf("%d", &year);
	if (year >= 1 && year <= 4000) {
		if (year % 4 == 0 && year % 100 != 0) printf("1");
		else if (year % 400 == 0) printf("1");
		else printf("0");
	}
	return 0;
}