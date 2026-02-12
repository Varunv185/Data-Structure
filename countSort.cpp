#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n;
    cout<<"Enter the size :";
    cin>>n;

    vector <int> v1(n);

    for(int i=0;i<n;i++){
        cout<<"Enter the elment :";
        cin>>v1[i];
    }

    vector <int> freq(100);

    for(int i=0;i<n;i++){
        freq[v1[i]]++;
    }

    for(int i=0,j=0;i<100;){
        if(freq[i]!=0){
            v1[j++]=i;
            freq[i]--;
        }
        else{
            i++;
        }
    }

    for(int e:v1){
        cout<<e<<"\t";
    }
    
}