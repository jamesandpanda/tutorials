int main(void) {
    int x = 5;

    int* y = malloc(5);
}

int func() {
    int x = 5;
    int* y = malloc(5);
    free(y);
}

// RAII
// resource acquisition is initialisation
