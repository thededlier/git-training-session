#include<iostream>
#define max 100;
using namespace std;
int main()
{
	int a[max],len,min;
	cout<<"Enter the no. of elements in array:";
	cin>>len;
	cout<<"\nEnter each element of the array:";
	for(int i=0; i<len; ++i)
		cin>>a[i];
	for(i=0; i<len-1; i++){
		min=i;
		for(j=i+1; j<len; ++j)
			if(a[j]<a[min])
				min=j;
	 	a[i]+=a[min];
	 	a[min]=a[i]-a[min];
		a[i]-=a[min];
	}
	cout<<"\nArray after sorting is:";
	for(i=0; i<len; i++)
		cout<<"  "<<a[i];
	return 0;
}
