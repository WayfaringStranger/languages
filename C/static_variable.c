#include <stdio.h>
void display();

int main() {
	display();
	display();
}

void display() {
	static int c = 1;
	c += 5;
	printf("%d\n", c);
}
