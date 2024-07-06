// https://usaco.org/index.php?page=viewproblem2&cpid=1251
/*
ID: luyangj1
PROG: ride
LANG: C++
*/
#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main(){
	// ofstream fout ("college.out");
  ifstream fin ("college.in");
	int N;
  fin >> N;
  int a;
  for(int i = 0; i < N; ++i) {
    fin >> a;
    cout << a << "\n";
  }
}