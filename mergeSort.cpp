#include<iostream>
#include<vector>
using namespace std;
void merging(vector<int> &a,vector<int> &t,int lb1,int ub1,int lb2,int ub2){
    int i,j,k;
    for(i=lb1,j=lb2,k=lb1;i<=ub1&&j<=ub2;k++){
        if(a[i]<a[j]){
            t[k]=a[i++];
        }
        else{
            t[k]=a[j++];
        } 
    }
        while(i<=ub1){
            t[k++]=a[i++];
        }
        while(j<=ub2){
            t[k++]=a[j++];
        }

        for(i =lb1;i<=ub2;i++){
            a[i]=t[i];
        }
    }

void mergeSort(vector<int> &a,vector<int> &t,int lb,int ub){
    if(lb>=ub){
        return ;
    }
    int mid=(lb+ub)/2;
    mergeSort(a,t,lb,mid);
    mergeSort(a,t,mid+1,ub);
    merging(a,t,lb,mid,mid+1,ub);

}


int main(){
    int n;
    cout<<"Enter the size:";
    cin>>n;

    vector<int> v1(n) ,t(n);

    for(int i=0;i<n;i++){
        cout<<"Enter element :";
        cin>>v1[i];
    }
 

    mergeSort(v1,t,0,n-1);

    for(int e: v1){
        cout<<e<<"\t";
    }
}