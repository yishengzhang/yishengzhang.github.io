#include <iostream>
#include <stdexcept>

using namespace std;

bool application (double gpa, double score)
{
    if (gpa >= 2 && score >=75)
    {
        return true;
    }
    return false;
}
//methods must be at top
int main()
{
    string name;
    double gpa = 0, score = 0;
    //mayb be an error if cout does not have endl before cin
    cout<<"name: "<<endl;
    cin>>name;
    cout<<"gpa: "<<endl;
    cin>>gpa;
    cout<<"score: "<<endl;
    cin>>score;
    if ((gpa>=0&&gpa<=4)&&(score>=0&&score<=100))
    {
        bool acceptance = application(gpa,score);
    }
    else
    {
        throw invalid_argument("incorrect");
    }
    return 0;
}
