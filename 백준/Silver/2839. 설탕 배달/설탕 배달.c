#include <stdio.h>

int main()
{
	int num, count = 0;
	scanf("%d", &num);

	while (1) {
		if (num % 5 == 0) {
			printf("%d\n", num / 5 + count);
			break;
		}
		else if (num <= 0) {
			printf("-1\n");
			break;
		}
		num -= 3;
		count++;
	}
	return 0;
}