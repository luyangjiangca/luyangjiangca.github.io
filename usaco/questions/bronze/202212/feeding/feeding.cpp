//https://usaco.org/index.php?page=viewproblem2&cpid=1252
/*
ID: luyangj1
PROG: feeding
LANG: C++
*/
#include <fstream>
#include <string>
#include <algorithm>
#include <iostream>
#include <string.h>
using namespace std;

int main(){

  int cases;
  cin >> cases;
  for(int i = 0; i<cases; i++)
  {
    int grass = 0;
    int numcows;
    cin >> numcows;
    int movedist;
    cin >>movedist;
    string a;
    string cows="";
    string feed="";
    for(int i = 0; i<numcows;i++)
    {
      feed.append(".");
    }
    cin >> cows;
    int prevG = movedist+movedist+1;
      int prevH = movedist+movedist+1;
    int T = numcows;
    int x = -1;

    while(T--){
      x++;
      int fed = 0;
      char currentCow = cows[x];
      bool feeded = false;
      if(prevG<=movedist&&currentCow=='G')
      {
          feeded = true;
      }else if(prevH<=movedist&&currentCow=='H')
      {
        feeded = true;
      }
      if(!feeded)
      {
        for(int i = movedist; i>=-movedist; i--)
        {
            if('.'==feed[x+i])
            {
              feed[x+i] = currentCow;
              grass++;
              if(currentCow=='G')
              {
                prevG = -i+1;
                prevH++;
              }else{
                prevH = -i+1;
                prevG++;
              }
              break;
            }
            
        }
      }else{
          prevG++;
          prevH++;
        }
    }
    cout<<grass<<endl;
    cout<<feed;
    cout<<endl;
  }
  // cin.get();//windows need this line to show the output in terminal console, commnent out when submit
}