#include <iostream>
#include <string>
using namespace std;
class Photo
{
    protected:
        double price,width,height;
    public:
        Photo (double width, double height)
        {
            this->width=width;
            this->height=height;
        }
        void setWidth (double width){this->width = width;}
        double getWidth() {return width;}
        void setHeight (double height){this->height = height;}
        double getHeight(){return height;}
        virtual double getPrice()
        {
            if (((width == 10) && (height==12))||((width == 12) && (height==10)))
            {
                price = 5.99;
            }
            else if (((width == 10) && (height==8))||((width == 8) && (height==10)))
            {
                price = 3.99;
            }
            else
            {
                price = 9.99;
            }
            return price;
        }
};
class MattedPhoto : public Photo
{
        string colour;
    public:
        MattedPhoto (double width, double height, string colour) : Photo (width,height)
        {
            this->colour=colour;
        }
        void setColour (string colour){this->colour = colour;}
        string getColour() {return colour;}
        double getPrice()
        {
            if (((width == 10) && (height==12))||((width == 12) && (height==10)))
            {
                price = 5.99;
            }
            else if (((width == 10) && (height==8))||((width == 8) && (height==10)))
            {
                price = 3.99;
            }
            else
            {
                price = 9.99;
            }
            return price+10;
        }
};
class FramedPhoto : public Photo
{
        string material;
    public:
        FramedPhoto (double width, double height, string material) : Photo (width,height)
        {
            this->material=material;
        }
        void setMaterial (string material){this->material = material;}
        string getMaterial() {return material;}
        double getPrice()
        {
            if (((width == 10) && (height==12))||((width == 12) && (height==10)))
            {
                price = 5.99;
            }
            else if (((width == 10) && (height==8))||((width == 8) && (height==10)))
            {
                price = 3.99;
            }
            else
            {
                price = 9.99;
            }
            return price+25;
        }
};
int main()
{
    MattedPhoto pic (10,12,"red");
    cout<<pic.getPrice();
    return 0;
}
