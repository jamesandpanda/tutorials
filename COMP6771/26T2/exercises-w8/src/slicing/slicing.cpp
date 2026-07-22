#include <iostream>
#include <vector>
#include <memory>

class A {
public:
    // A() {
    //     std::cout << "A" << '\n';
    // }

    // "virtual"
    virtual void method() {
        std::cout << "A" << '\n';
    }
};

class B : public A {
public:
    // B() {
    //     std::cout << "B" << '\n';
    // }

    void method() override {
        std::cout << "B" << '\n';
    }
};

std::unique_ptr<A> createObject() {
    int x = 2;

    if (x == 1) {
        auto a = std::make_unique<A>();
        return a;
    } else {
        auto b = std::make_unique<B>();
        return b;
    }
}

int main(void) {
    A a;
    B b;

    a = b;
    a.method(); // object slicing; outputs A

    A& aref = b;
    aref.method(); // prevents object slicing; outputs B

    auto c = createObject(); // needed to allocate heap mem to output from function
    // return actual type: object slicing problem
    // return reference: dangling reference
    c->method();
}