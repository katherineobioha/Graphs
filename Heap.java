  public class Heap {
            private Vertex[] items;
            private int maxSize;
            private int size;

            public Heap(int maxSize) {
                this.maxSize = maxSize;
                items = new Vertex[maxSize];
            }

            public void bubbleUp(Vertex vertex) {
                // @TODO
                int i = 0;
                for (; i < size; i++) {
                    if (items[i] == vertex) {
                        break;
                    }
                }
                if (i < size) {
                    int currentIndex = i;
                    Vertex currentItem = items[currentIndex];
                    int parentIndex = (currentIndex-1) / 2;
                    Vertex parentItem = items[parentIndex];
                    while (currentItem.compareTo(parentItem) == -1) {
                        swap(currentIndex, parentIndex);
                        currentIndex = parentIndex;
                        currentItem = items[currentIndex];
                        parentIndex = (currentIndex-1) / 2;
                        parentItem = items[parentIndex];
                    }
                }
            }

            public void add(Vertex item) {
                items[size] = item;
                heapADDALL();
                size++;
            }

            private void swap(int index1, int index2) {
                Vertex temp = items[index1];
                items[index1] = items[index2];
                items[index2] = temp;
            }

            private void heapADDALL() {
                int currIndex = size;
                Vertex currItem = items[currIndex];
                int parentIndex = currIndex / 2;
                Vertex parentItem = items[parentIndex];
                while (currItem.compareTo(parentItem) == -1) {
                    swap(parentIndex, currIndex);
                    currIndex = parentIndex;
                    currItem = items[currIndex];
                    parentIndex = currIndex / 2;
                    parentItem = items[parentIndex];
                }
            }

            public Vertex remove() {
                return remove(0);
            }

            public Vertex remove(Vertex vertex) {
                int i = 0;
                for (; i < size; i++) {
                    if (items[i] == vertex) {
                        break;
                    }
                }
                if (i < size) {
                    return remove(i);
                }
                return null;

            }

            private Vertex remove(int index) {
                Vertex vertex = items[index];
                //swap(index, size - 1);
                items[index] = null;
                size--;
                heapARRANGE(index);
                return vertex;
            }

            private void heapARRANGE(int index) {
                int currIndex = index;
                Vertex currItem = items[currIndex];
                int childIndex;
                Vertex childItem;
                int left = 2 * currIndex + 1;
                int right = 2 * currIndex + 2;
                if (left > size - 1) {
                    return;
                }
                if (right > size - 1) {
                    childIndex = left;
                } else if (items[left].compareTo(items[right]) == -1) {
                    childIndex = left;
                } else {
                    childIndex = right;
                }
                childItem = items[childIndex];

                while (childItem.compareTo(currItem) == -1) {
                    //swap(currIndex, childIndex);
                    childIndex=currIndex;;
                    currItem = items[currIndex];
                    left = 2 * currIndex + 1;
                    right = 2 * currIndex + 2;
                    if (left > size - 1) {
                        return;
                    }
                    if (right > size - 1) {
                        childIndex = left;
                    } else if (items[left].compareTo(items[right]) == -1) {
                        childIndex = left;
                    } else {
                        childIndex = right;
                    }
                    childItem = items[childIndex];
                }
            }

            public boolean isEmpty() {
                return size == 0;
            }
        }