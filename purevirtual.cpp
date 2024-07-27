#include<iostream>
using namespace std;

class Circle
{
	public:                                //access specifier
		float PI;                          //characteristics
		float Radius;                      //characteristics
		
	  Circle()                             //default constructor
	  {
		  PI = 3.14;
		  Radius = 0.0;
	  }
	  
   	  Circle(float A, float B)             //parameterised construtor
	  {
		  PI = A;
		  Radius = B;
	  }
	  
	  void Display()            //concrete method (function with the body)
	  {
		  cout<<"Value Of Radius Is:"<<Radius<<"\n";
	  }
	  
	  virtual float Area() = 0;               //abstract method
	  virtual float Circumfarance() = 0;      //abstract method
};

class Marvellous : public Circle
{
	public:
	 Marvellous() : Circle()
	 {
		 
	 }
	 Marvellous(float X, float Y) : Circle(X,Y)
	 {
		 
	 }
		float Area()                        //concrete method
		{
			float Ans = PI * Radius * Radius;
			return Ans;
		}
		float Circumfarance()
		{
			float Ans = 0.0;
			Ans = 2 * PI * Radius;
			return Ans;
		}
};
int main()
{
	Marvellous mobj1;
	Marvellous mobj2(3.14,10.89);
	float fret = 0.0;
	
	fret = mobj2.Area();
	cout<<"Area is:"<<fret<<"\n";

	fret = mobj2.Circumfarance();
	cout<<"Circumfarance is:"<<fret<<"\n";
	return 0;
}