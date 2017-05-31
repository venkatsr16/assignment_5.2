public class FixedSizeStack {
  int top, numElements;
  int[] baseArray;

  public FixedSizeStack(int maxSize) {
    top = 0;
    numElements = 0;
    baseArray = new int[maxSize];
  }

  public void push(int num) {
    baseArray[top] = num;
    top = (top+1) % baseArray.length;
    numElements++;
  }

  public int pop(int num) {
    if(numElements == 0) return null;  //or throw exception--you've removed too many elements!
    numElements--;

    top = (top == 0) ? (baseArray.length - 1) : (top - 1);
    return baseArray[top];
  }
public static void main(String args[]){
	FixedSizeStack fss = new FixedSizeStack(8);
	fss.push(5);
	fss.pop(4);
}
}
