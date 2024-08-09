#include <stdio.h>

int main() {
    int n, r, rev = 0, t;

    printf("Enter a number: ");
    scanf("%d", &n);

    t = n;  // store original number in temp variable

    while (n > 0) {
        r = n % 10;         // get last digit
        rev = rev * 10 + r; // build reverse number
        n = n / 10;         // remove last digit
    }

    if (t == rev) {
        printf("%d  is a palindrome.\n",t);
    } else {
        printf("%d is not a palindrome.\n",t);
    }

    return 0;
}
