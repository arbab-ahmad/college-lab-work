#include<stdio.h>
#include<math.h>

// Function to check if a number is prime
int isPrime(int n) {
    int i, count = 0;
    
    // Checking divisibility of the number
    for(i = 2; i <= sqrt(n); i++) {
        if(n % i == 0) {
            count++;
        }
    }
    
    // If the number is not divisible by any number, it is prime
    if(count == 0) {
        return 1;
    }
}

int main() {
    int j, lr = 0, ur = 0, prime;
    
    // Taking input for the lower and upper range
    printf("Enter the range to get the list of prime numbers between the given range: \n");
    printf("Enter lower range: ");
    scanf("%d", &lr);
    printf("Enter upper range: ");
    scanf("%d", &ur);
    
    // Ensuring the lower range starts from 2, as prime numbers start from 2
    if(lr < 2) {
        lr = 2;
    }
    
    // Printing the list of prime numbers within the given range
    printf("\nFollowing is the List of the prime numbers between the given range: \n");
    
    for(j = lr; j <= ur; j++) {
        prime = isPrime(j);
        if(prime == 1) {
            printf("%d | ", j);
        }
    }
}
