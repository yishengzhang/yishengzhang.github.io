#include <iostream>
#include <cstdlib>

using namespace std;

int main(){
    const int SENTINEL=0;
    int newscore,countertotal=0,counter70=0;
    double percentage;
    cout<<"Enter new score.\n";
    cout<<"Enter a value ("<<SENTINEL<<" to quit): ";
    cin>>newscore;
    cout<<endl;
    while(newscore!=SENTINEL)
    {
        countertotal++;
        if (newscore>=70)
            {
                counter70++;
            }
        cout<<"Enter new score.\n";
        cout<<"Enter a value ("<<SENTINEL<<" to quit): ";
        cin>>newscore;
        cout<<endl;
    }
    percentage=((double)counter70/(double)countertotal)*100;
    cout<<"The percentage of scores above 70 is "<<percentage<<"%.";
    system("PAUSE");
    return 0;
    }
