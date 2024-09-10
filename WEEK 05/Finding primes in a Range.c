#include<stdio.h>
#include<math.h>

// Function to check if a number is prime
int isPrime(int n){
    int i, count=0;
    
    // Iterate from 2 to square root of n
    for(i=2; i<=sqrt(n); i++){
        if(n%i==0){
            count++; // Increment count if divisible
        }    
    }
    
    // Return 1 if no divisors found, indicating a prime number
    if(count==0){
        return 1;
    }
}

int main(){
    // Display the purpose of the program
    printf("**This program is for finding prime numbers between a given range**\n\n");

    int j, lr=0, ur=0, prime;
    
    // Take input for lower and upper range
    printf("Enter the lower range and upper range to get the list of prime numbers between the given range : \n");
    printf("Enter lower range : ");
    scanf("%d",&lr);
    printf("Enter upper range : ");
    scanf("%d",&ur);
    
    // Set lower range to 2 if input is less than 2
    if(lr<2){
        lr=2;
    } 
    
    // Display the prime numbers within the range
    printf("\nFollowing is the List of the prime numbers between the given range : \n");
    
    for(j=lr; j<=ur; j++) {
        prime=isPrime(j);
        if(prime==1){
            printf("%d\t",j);        
        }
    }
}
