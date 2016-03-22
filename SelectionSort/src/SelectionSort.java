class SelectionSort {
	public void sort(int[] values){
		int out, in, min;

		for(out=0;out<values.length-1;out++){
			min = out;
			if(values[in] < values[min]){
				min = in;
			}
		}
		this.swap(out,min);
	}

	private void swap(int index1, int index2){
		int temp = values[index1];
		values[index1] = values[index2];
		values[index2] = temp;
	}
}