package stack;

/**
 * Implements a dynamic array
 */
public class DynamicStackImpl extends StackArrayImpl {

  public DynamicStackImpl() throws Exception {
    this(DEFAULT_ARRAY_LENGTH);
  }

  public DynamicStackImpl(int size) throws Exception {
    super(size);

  }

  @Override
  public void push(int num) throws Exception {
    if (this.top + 1 == this.data.length) {
      int[] arr = new int[2 * this.data.length];
      for (int i = 0; i < this.data.length; i++) {
        arr[i] = this.data[i];
      }
      this.data = arr;
    }
    super.push(num);

  }
}
