//Passing Object as Function Argument in C++
#include<iostream>
  using namespace std;
  class Distance
        {
  	private:
  		int km,hr;
  	public:
  		Distance():km(0),hr(0){
		}
		void get()
		{
		  	cout<<"Enter Distance in KiloMeters:";
		  	cin>>km;
		  	cout<<"Enter Hours of Distance:";
		  	cin>>hr;
		}
		void show()
		{
		  	cout<<"Your Traveled is "<<km<<" KM in "<<hr<<" Hours"<<endl;
		}
		void totaldis(Distance pass)
		{
		  	Distance t;
		  	t.km=km+pass.km;
		  	t.hr=hr+pass.hr;
		  	cout<<"Total Traveled is "<<t.km<<" Kilometers in "<<t.hr<<" Hours";
		  }
  };
  int main()
  {
  	Distance youdis, mydis;
  	cout<<"-----------Your Input of Distance-----------"<<endl;
  	youdis.get();
  	youdis.show();
	cout<<"-----------My Input of Distance-----------"<<endl;
	mydis.get();
	mydis.show();
	cout<<"-----------Total Output of Distance-----------"<<endl;
	youdis.totaldis(mydis);
	}