#include <stdio.h>
#include <math.h>

int main()
{
	double alas, tinggi,sisim, a, b,c;
	
	printf("Masukkan Panjang alas \t: ");
	scanf("%d",&alas);
	
	printf("Masukkan tinggi \t: ");
	scanf("%d",&tinggi);
	
	a=alas*alas;
	b=tinggi*tinggi;
	c=a+b;
	sisim = sqrt(c);
	
	printf("Panjang sisi miring \t: %.lfcm\n", sisim);
	
	return 0;
}
