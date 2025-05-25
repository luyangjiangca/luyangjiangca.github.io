
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
    // ifstream fin ("C:\\Users\\luyan_\\luyangjiangca.github.io\\usaco\\questions\\bronze\\202212\\leader\\1.in");
    int N;
    cin >> N;
    string cows;
    string herd;
    // bool posLeader[N];
    // bool used[N];
    int lists[N];
    cin>> cows;
    int totalLeaders = 0;
    for(int i = 0; i<N; i++)
    {
        // cows[i] = herd[i];
        posLeader[i] = false;
        // used[i] = false;
    }
    for(int i = 0; i<N; i++)
    {
        cin >> lists[i];
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

    for(int i = 0; i<N; i++)
    {
        if(cows[i] == 'G')
        {
            if((lists[i]-1)>=lastG  && i <= firstG)
            {
                posLeader[i] = true;
                // if(i != firstG || i == lastG){totalLeaders--;}
            }
        }else if(cows[i] == 'H'){
            if((lists[i]-1)>=lastH && i <= firstH)
            {
                posLeader[i] = true;
                // if(i != firstH || i == lastH){totalLeaders--;}
            }
        }
    }

    for(int i = 0; i<N; i++)
    {
        int x = i;
        if(x!= lastG && x!= lastH)
        {
           for(x = i+1; x<lists[i]; x++)
            {
                if(posLeader[x])//&& !used[x])
                {
                    // used[x] = true;
                    totalLeaders++;
                    
                }
            }
        }else{
           for(x = i; x<lists[i]; x++)
            {
                if(posLeader[x])//&& !used[x])
                {
                    // used[x] = true;
                    totalLeaders++;
                    
                }
            } 
        }
    }
    cout<<totalLeaders;
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
    // cin.get();
}
