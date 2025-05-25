//https://usaco.org/index.php?page=viewproblem2&cpid=1253
/*
ID: luyangj1
PROG: reverse
LANG: C++
*/
#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
// #include <iostream>
using namespace std;
int rows,cols;
string inputs[100];
int outputs[100];
bool splits[100];


bool split (int j, int compare, int output)
{
  if(splits[j])
  {
    return false;
  }
  for(int y = 0; y<cols; y++)
  {
    if(!inputs[y].empty() && (inputs[y][j]==compare) && (outputs[y]!=output))
    {
      return false;
    }
  }
  splits[j] = true;
  for(int w = 0; w<cols;w++)
  {
    if(!inputs[w].empty() && inputs[w][j] == compare)
    {
      inputs[w] = "";
    }
  }
  return true;
}

bool all_equal(int test_out)
{
  for(int i = 0; i<cols; i++)
  {
    if(!inputs[i].empty()&&(outputs[i]!= test_out))
    {
      return false;
    }
  }
  return true; 
}
int main(){
  // ifstream fin ("C:\\Users\\luyan_\\luyangjiangca.github.io\\usaco\\questions\\bronze\\202212\\reverse\\1.in");
  // cout <<"sussyuwubakaobby";
  int T;
  cin>>T;
  // cout << T;
  // cout << "696";
  while(T--)
  {
    // ifstream fin ("1.in");
    
    cin>>rows; //N
    cin>>cols;//M
    for(int i = 0; i<cols; i++)
    {
      cin>>inputs[i]>>outputs[i];
    }
    for(int ii = 0; ii<rows; ii++)
    {
      splits[ii] = false;
    }
    // for(int col = 0; col<cols; col++)
    // {
    //   for(int row = 0; row<rows; row++)
    //   {

    //   }
    // }
    while (true)
    {
       bool followrule = false;

       for(int x = 0; x<rows; x++)
       {
        if(split(x, '0', 0)||
        split(x, '1', 0)||split(x, '0', 1)||
        split(x, '1', 1)){
          followrule = true;
        }
       }
       if(!followrule)
       {
         cout << "LIE"<<endl;
         break;
       }
       if(all_equal(0)||all_equal(1)){
        cout<<"OK"<<endl;
        break;
       }
    }
    
  }
  // cout<<65677;
  // cin.get();
}