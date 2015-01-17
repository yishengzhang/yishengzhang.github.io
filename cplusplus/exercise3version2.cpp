#include <iostream>
#include <cstdlib>
#include <string.h>
#include <stdio.h>

using namespace std;

int main()
{
    string mystr;
    cout<<"Please enter in a number. ";
    cin>>mystr;
    int count,TempNumOne=mystr.size();
    int Filename[TempNumOne];
    for (int a=0;a<=TempNumOne;a++)
        {
            Filename[a]=mystr[a]-'0'; //to convert string to integer
        }
    for(int i = 0; i < 10; i++)//i = current digit
    {
        count =0;
        for (int j = 0; j < TempNumOne; j++)//j = index in array
        {
        if (i == Filename[j])
        {
            count++;
        }
        }
    cout<<"Number "<<i<<" has occured "<<count<<" many times \n";
    }
}
