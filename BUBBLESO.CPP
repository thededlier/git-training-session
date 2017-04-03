#include<iostream.h>
#include<conio.h>
void main()
{clrscr();
int a[100],len,count,temp;
cout<<"\n"<<" Enter the no. of numbers in array";
cin>>len;
cout<<"\n"<<"Enter the array";
for(int i=0;i<len;i++)
{cin>>a[i];
}
do
{ count=0;
for(i=0;i<len-1;i++)
{
if(a[i+1]<a[i])
{temp=a[i];
 a[i]=a[i+1];
 a[i+1]=temp;
 }
else
count++;
}
}
while(count!=len-1);

cout<<"\n"<<" Array after sorting is:";
for(i=0;i<len;i++)
{cout<<"  "<<a[i];
}
getch();
}
