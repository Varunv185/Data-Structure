#include<iostream>
#include<vector>
#include<stdlib.h>
using namespace std;
int main(){
    int n;
    cout<<"Enter the size";
    cin>>n;
    //input
    vector <int> v1(n);
    for(int i=0;i<n;i++){
        cout<<"Enter the element";
        cin>>v1[i];
    }

    //hashing
    vector <int> freq(100);
    for(int i=0;i<n;i++){
        freq[v1[i]]++;
    }

    //output
    for(int i=0;i<=99;i++){
        if(freq[i]!=0){
            cout<<i<<" ---> "<<freq[i]<<endl;
        }
    }


}