#include <stdio.h>
#include <math.h>

int main() {
    float a, b, c, d, r1, r2;

    // Take input from the user
    printf("Enter coefficient of x^2: ");
    scanf("%f", &a);
    
    printf("Enter coefficient of x: ");
    scanf("%f", &b);
    
    printf("Enter constant term: ");
    scanf("%f", &c);

    // Calculate discriminant
    d = b * b - 4 * a * c;

    // Determine and print the nature of the roots
    if (d > 0) {
        r1 = (-b + sqrt(d)) / (2 * a);
        r2 = (-b - sqrt(d)) / (2 * a);
        printf("Roots are real and different.\n");
        printf("r1 = %.2f\n", r1);
        printf("r2 = %.2f\n", r2);
    } else if (d == 0) {
        r1 = r2 = -b / (2 * a);
        printf("Roots are real and equal.\n");
        printf("r1 = r2 = %.2f\n", r1);
    } else {
        float real = -b / (2 * a);
        float imag = sqrt(-d) / (2 * a);
        printf("Roots are complex and different.\n");
        printf("r1 = %.2f + %.2fi\n", real, imag);
        printf("r2 = %.2f - %.2fi\n", real, imag);
    }

    return 0;
}
