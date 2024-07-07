// https://usaco.org/index.php?page=viewproblem2&cpid=1251
/*
ID: luyangj1
PROG: college
LANG: C++
*/
#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
#include <iostream>
using namespace std;

int main(){
	// ofstream fout ("college.out");
  // ifstream cin ("6.in");
	int N;
  cin >> N;
  int a;
  int maxTuitions[N];
  int orderedTuitions[N];
  for(int i = 0; i < N; ++i) {
    cin >> a;
    // cout << a << "\n";
    orderedTuitions[i]=a;
    maxTuitions[i] = a;
  }

  int min = orderedTuitions[0];
  int temp;
  int index;
 
  // for(int y = 0; y<sizeof(orderedTuitions)/sizeof(int); y++)
  // {
  //   min = orderedTuitions[y];
  //   // cout<<min<<"\n";
  //   for(int x=y; x<sizeof(orderedTuitions)/sizeof(int); x++)
  //   {
  //       if(orderedTuitions[x]<=min)
  //       {
  //           min=orderedTuitions[x];
  //           index=x;
  //       }
  //   }
  //   temp = orderedTuitions[index];
  //       orderedTuitions[index]=orderedTuitions[y];
  //       orderedTuitions[y]=temp;
  
  // }
  sort(orderedTuitions, orderedTuitions+sizeof(orderedTuitions)/sizeof(int));
  // for(int i:orderedTuitions)
  // {
  //   cout<<i << " ++ ";
  // }
  // for(int i:orderedTuitions)
  // {
  //   cout<<i;
  // }
  // cout<<"\n"<<sizeof(orderedTuitions)/sizeof(int);
  long long max = 0;
  long long maxTuition = max;
  // cout<<sizeof(orderedTuitions);
  for(int z = 0; z<sizeof(orderedTuitions)/sizeof(int); z++)
  {
    // cout<<(sizeof(orderedTuitions)/sizeof(int)-z)*orderedTuitions[z]<<"\n";
    if((sizeof(orderedTuitions)/sizeof(int)-z)*orderedTuitions[z]>max)
    {
      max = (sizeof(orderedTuitions)/sizeof(int)-z)*orderedTuitions[z];
      // cout<<"\n MWMWMW IMPORTANT MWMWM " << (sizeof(orderedTuitions)/sizeof(int)) <<" " << z << " "<<(sizeof(orderedTuitions)/sizeof(int)-z);
      maxTuition = orderedTuitions[z];
    }
  }
  cout << max <<" " << maxTuition;
  // cout << 6564 << 9;
}