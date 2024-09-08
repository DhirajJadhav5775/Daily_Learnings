#include<stdio.h>

int main()
{
	int iDay = 0;
	printf("Enter Day: \n");
	scanf("%d",&iDay);
	
	switch(iDay)
	{
		case 1 : 
		printf("today is sunday\n");
		break;
		
		case 2 : 
		printf("today is monday\n");
		break;
		
		case 3 : 
		printf("today is tuesday\n");
		break;
		
		case 4 : 
		printf("today is wednesday\n");
		break;
		
		case 5 : 
		printf("today is thursday\n");
		break;
		
		case 6 : 
		printf("today is friday\n");
		break;
		
		case 7 : 
		printf("today is saturday\n");
		break;
		
		default:
		printf("Error 53443434334");
		break;

	}
	
	return 0;
}