#include <iostream>
#include <algorithm>
#include <vector>

struct Tree {
    int positions;
    std::vector<int> dropped;
public:
    Tree(const int &, const std::vector<int> &);
    const int Quantity(const int &, const int &);
};

Tree::Tree(const int &positionsition, const std::vector<int> &deltas) {
    positions = positionsition;
    for (const int delta : deltas) {
        dropped.push_back(positions + delta);
    }
}

const int Tree::Quantity(const int &start, const int &end) {
    int count = 0;
    
    for (const int positions : dropped) {
        if (start <= positions && positions <= end) {
            count++;
        }
    }
    
    return count;
}

int main() {
    
    int start, end, positionA, positionB, numberApples, numberOranges;
	start= end= positionA= positionB= numberApples= numberOranges=0;
	
    
    std::cin >> start >> end; 
    std::cin >> positionA >> positionB; 
    std::cin >> numberApples >> numberOranges; 
    
    std::vector<int> apples(numberApples);
	short i =0;
    while(i = < numberApples){
       std::cin >> apples[i];
	   i++;
    }
       
    std::vector<int> oranges(n);
	i =0;
	while(i = < numberApples){
       std::cin >> oranges[i];
	   i++;
    }
     
    // instantiate trees
    Tree apple(a, apples);
    Tree orange(b, oranges);
    
    // get droppings in range
    std::cout << apple.Quantity(start, end) << std::endl;
    std::cout << orange.Quantity(start, end) << std::endl;
    
    return 0;
    
}