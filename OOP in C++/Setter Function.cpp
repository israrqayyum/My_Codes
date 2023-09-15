/* 
Write program to use setter function
*/
#include<iostream>
#include<string.h>
  using namespace std;
  class book
   {
   	private:
   		int page;
   		float price;
   		char name[30];
   	public:
	    void setpage(int p)
		{
			page=p;
	    }
		void setprice(float pr)
		{
			price=pr;
		}	
		void setname(char *n)
		{
			strcpy(name,n);
		}
		void display()
		{
			cout<<"The Page is: "  <<page<<endl;
			cout<<"The Price is: "<<price<<endl;
			cout<<"The Name is: " <<name<<endl;
		}
		
		
   };
   
   int main()
   {
   	book b1,b2;
   	cout<<"---------Book1 Data---------"<<endl;
   	b1.setpage(100);
   	b1.setprice(300.98);
   	b1.setname("Web PRogramming");
   	b1.display();
    cout<<"---------Book2 Data---------"<<endl;
    b2.setpage(200);
   	b2.setprice(500.98);
   	b2.setname("Object Oriented programming in c++");
   	b2.display();
   }
   