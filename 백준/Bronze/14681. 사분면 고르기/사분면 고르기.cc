#include <stdio.h>

int main()
{
	int x, y = 0;
	scanf("%d", &x);
	scanf("%d", &y);
	if (-1000 <= x && x <= 1000 && -1000 <= y && y <= 1000) 
	{
		if (x > 0 && y > 0)printf("1");
		else if (x < 0 && y > 0)printf("2");
		else if (x < 0 && y < 0) printf("3");
		else printf("4");
	}
	return 0;
}