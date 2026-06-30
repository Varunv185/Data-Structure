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
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the size :");
        n = sc.nextInt();

        int[] v1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element :");
            v1[i] = sc.nextInt();
        }

        int[] freq = new int[100];

        for (int i = 0; i < n; i++) {
            freq[v1[i]]++;
        }

        for (int i = 0, j = 0; i < 100;) {
            if (freq[i] != 0) {
                v1[j++] = i;
                freq[i]--;
            } else {
                i++;
            }
        }

        for (int e : v1) {
            System.out.print(e + "\t");
        }

        sc.close();
    }
}*/