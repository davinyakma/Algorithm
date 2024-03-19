#include <stdio.h>

int main() {
	int num = 0;
	scanf("%d", &num);
	if (num >= 1 && num <= 9) {
		for (int i = 1; i < 10; i++) {
			printf("%d * %d = %d\n", num, i, num * i);
		}
	}
	return 0;
}