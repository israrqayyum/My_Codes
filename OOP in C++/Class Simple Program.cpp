#include<iostream>
  using namespace std;
   
   class israr              //class reserved word,class name 
   {
   	private:                //private means data memebers are secure and accessible only in the class
   		int m=3;            //data memebers
   	public:                 //public means accessible everywhere
   		void display()      //member function
   		{
   			cout<<"Roll No is:"<<m;
		}
   };
   
   int main()              //main function
{ 
   
   israr s1;               //object s1 of class
   s1.display();	       //callling the member function
}
/*
member function inside the class means it is decleare inside the class while member function outside the class means 
its prototype decleare in the class and defination we can give anywhere in the program following function return type
class name scope resolution operator::function name
*/