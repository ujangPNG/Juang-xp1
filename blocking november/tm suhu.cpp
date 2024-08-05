#include <stdio.h>
#define PHI 3.14
int main()
{
	float celcius, fahr, reamur, r1, r2,e,l,s;
	
	printf("KONVERTER SUHU\n\n");
	
	printf("Input suhu (celcius) \t: ");
	scanf("%f", &celcius);
	
	s=9;
	e=4;
	l=5;
	r1=s/l;
	r2=e/l;
	
	fahr = r1 * celcius + 32;
	reamur = r2 * celcius ;
	
	printf("\nFahrenheit: \t: %.2f\nReamur \t: %.2f", fahr, reamur);
	return 0;
}
