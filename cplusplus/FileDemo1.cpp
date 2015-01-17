#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main()
{
    string line;
    int count = 0;
    bool pass = true;
    //ifstreams is mainly for opening files
    ifstream myfile ("FileDemo1.txt");
    if (myfile.is_open())
    {
        while ( (getline (myfile,line))&&(pass==true))
        {
            cout << line << '\n';
            count++;
            if (count % 15 == 0)
            {
                pass = false;
                cout<<"Show next 15 files? true or false ";
                cin>>pass;
            }
        }
    myfile.close();
    }
    else cout << "Unable to open file";
    return 0;
}
