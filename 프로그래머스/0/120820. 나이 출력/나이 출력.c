#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int age) {
    int answer = 0;
    answer = (2022 - age) + 1; //1살 먹고 태어나는 거니깐 
    return answer;
}