#include<iostream>
using namespace std;

//function to output steps of solving Tower Of Hanoi with n discs

void toh(int n,char src,char dest ,char help){
    if(n==0){return ;}
    toh(n-1,src,help,dest);
    cout<<" move from "<<src<<" to "<<dest<<endl;
    toh(n-1,help,dest,src);
}

int main(){

    // call to toh function 
    toh(3,'A','B','C');
    return 0;
}