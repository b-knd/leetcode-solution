#include <stdio.h>
#include <limits.h>
#include <stdbool.h>

//https://www.geeksforgeeks.org/queue-set-1introduction-and-array-implementation/

struct Queue {
    int front, rear, size;
    unsigned capacity; 
    int* array;
};

struct Queue* createQueue(unsigned capacity){
    struct Queue* queue = (struct Queue*)malloc(sizeof(struct Queue));
    queue->capacity = capacity;
    queue->front = queue->size = 0;

    queue->rear = capacity-1;
    queue->array = (int*)malloc(queue->capacity * sizeof(int));
    return queue;
}

int isFull(struct Queue* queue){
    return (queue->size == queue->capacity);
}

int isEmpty(struct Queue* queue){
    return (queue->size == 0);
}

void enqueue(struct Queue* queue, int item){
    if(isFull(queue)){
        return;
    }
    queue->rear = (queue->rear + 1) % queue->capacity;
    queue->array[queue->rear] = item;
    queue->size = queue->size + 1;
}

int dequeue(struct Queue* queue){
    if(isEmpty(queue)){
        return INT_MIN;
    }
    int item = queue->array[queue->front];
    queue->front = (queue->front + 1) % queue->capacity;
    queue->size = queue->size - 1;
    return item;
}

int front(struct Queue* queue){
    if(isEmpty(queue)){
        return INT_MIN;
    }
    return queue->array[queue->front];
}

int rear(struct Queue* queue){
    if(isEmpty(queue)){
        return INT_MIN;
    }
    return queue->array[queue->rear];
}







//Stack using queue
typedef struct {
    int size;
    struct Queue *queue;
} MyStack;


MyStack* myStackCreate() {
    MyStack *obj = (MyStack *)malloc(sizeof(MyStack));
    obj->queue = createQueue(100);
    return obj;
}

void myStackPush(MyStack* obj, int x) {
    if(isFull(obj->queue)){
        return;
    }
    enqueue(obj->queue, x);
    for(int i = 1; i < obj->queue->size; i++){
        enqueue(obj->queue, dequeue(obj->queue));
    }
}

int myStackPop(MyStack* obj) {
    int popElement;
    if(isEmpty(obj->queue)){
        return;
    }
    return dequeue(obj->queue);
}

int myStackTop(MyStack* obj) {
    return front(obj->queue);
}

bool myStackEmpty(MyStack* obj) {
    return isEmpty(obj->queue);
}

void myStackFree(MyStack* obj) {
    while(obj->queue->size > 0){
        dequeue(obj->queue);
    }
}