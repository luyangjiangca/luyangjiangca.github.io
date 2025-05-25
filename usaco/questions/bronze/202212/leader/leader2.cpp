
//https://usaco.org/index.php?page=viewproblem2&cpid=1275
/*
ID: luyangj1
PROG: leader
LANG: C++
*/
#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
#include <iostream>
using namespace std;

int main(){
    int lastG = -5;
    int lastH = -5;
    int firstG = -5;
    int firstH = -5;

	// ofstream fout ("feeding.out");
    ifstream fin ("C:\\Users\\luyan_\\luyangjiangca.github.io\\usaco\\questions\\bronze\\202212\\leader\\2.in");
    int N;
    fin >> N;
    string cows;
    // bool posLeader[N];
    // bool used[N];
    int lists[N];
    fin>> cows;
    int totalLeaders = 0;
    // cout<<"jgjkhuvdxgtjyft";
    for(int i = 0; i<N; i++)
    {
        fin >> lists[i];
    }
    for(int i = N; i>=0; i--)
    {
        // cout<< i<<"<<Yo lookit htis  ";
        if(cows[i] == 'G' && lastG ==-5) lastG = i;
        else if(cows[i] == 'H'&& lastH ==-5) lastH = i;
        if(lastG != -5 && lastH != -5)
        {
            break;
        }
    }

    for(int i = 0; i<N; i++)
    {
        // cout<< i<<"<<Yo lookit htis  ";
        if(cows[i] == 'G' && firstG ==-5) firstG = i;
        else if(cows[i] == 'H'&& firstH ==-5) firstH = i;
        if(firstG != -5 && firstH != -5)
        {
            break;
        }
    }
    // cout<<"woa it worked :O";
    // for(int i = 0; i<sizeof(lists)/sizeof(int); i++)
    // {
    //     if(cows)
    // }
    // cout<<firstG<<" << dis da first G "<<lastG<<" <<dis da last G "<<firstH<<" <<dis da first H "<<lastH<<" <<dis da last H";
    if(lists[firstG]-1 >= lastG){
        for(int i = firstG+1; i<sizeof(cows)/sizeof(string);i++)
        {
            if(cows[i] == 'H' &&  i!=firstH){
                totalLeaders++;
            }
        }
        for(int i = 0; i<firstG; i++)
        {
            if(cows[i] == 'H' && lists[i]-1>=firstG)
            {
                totalLeaders++;
            }
        }
    }
    if(lists[firstH]-1 >= lastH){
        for(int i = firstH+1; i<sizeof(cows)/sizeof(string);i++)
        {
            if(cows[i] == 'G' && i!=firstG){
                totalLeaders++;
            }
        }
        for(int i = 0; i<firstH; i++)
        {
            if(cows[i] == 'G' && (lists[i]-1)>=firstH)
            {
                totalLeaders++;
            }
        }
    }

   
    cout<<totalLeaders<<endl;
    //^^IMPORTANT

    // cout <<firstH << "<<first H "<<lastH<<"<<first G  ";
    // cout<<N<<"<<N "<<endl;
    // cout<<lastG<<"<<last G "<<lastH<<"<<last H "<<endl;
    // cout<<(1==2)<<"<<THIS IS IMPORTANT"<<endl;
    // for(int i = 0; i<N; i++)
    // {
    //     cout<<posLeader[i]<<endl;
    // }
    // for(int i = 0; i<N; i++)
    // {
    //     cout<<used[i]<<endl;
    // }
    // for(int i = 0; i<N; i++)
    // {
    //     cout<<lists[i]<<endl;
    // }
    cin.get();
}
