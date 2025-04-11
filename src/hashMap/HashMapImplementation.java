package hashMap;

public class HashMapImplementation{
	int size = 16;
	Entry buckets[] = new Entry[size];

	public int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key)) % size;
	}

	public void put(int key, int value) {
		int index = getBucketIndex(key);
		Entry node=new Entry(key, value);
		System.out.println("Entry is at:"+index);
		Entry current = buckets[index];

		if (current == null) {
			buckets[index] = node;
			return;
		} else {
//			Entry current = existing;
			while (current != null) {
				if (current.key == key) { //checking if new entry is already present in the linked list
					current.value = value;// updating value
					return;
				}
				current=current.next;
			}
			node.next=buckets[index]; //marking the new node as head
			buckets[index]=node; //storing head in the array
		}

	}
	
	public int getValue(int key) {
		int index=getBucketIndex(key);
//		System.err.println(index);
		Entry current=buckets[index];
//		System.err.println(current);
		while(current!=null) {
//			System.err.println(current.key);
			if(current.key==key) {
				return current.value;
			}
			current=current.next;
		}
		return -1;
//		throw new RuntimeException("Key not found");
	}
	
	public void deleteByKey(int key) {
		int index = getBucketIndex(key);
		Entry current = buckets[index];
		Entry previous = null;

		while (current != null) {
			if (current.key == key) {
				if (previous == null) {
					buckets[index] = current.next;
					System.out.println("Element deleted");
				} else {
				
					previous.next = current.next;
					System.out.println("Element deleted");
				}
				return;
			}
			previous = current;
			current = current.next;
			System.out.println("Element deleted");
		}

		System.err.println("Key " + key + " not found for deletion");
	}
	
	public void display() {
		for (int i = 0; i < size; i++) {
			Entry current = buckets[i];
			System.out.print("Bucket " + i + ": ");
			while (current != null) {
				System.out.print("[" + current.key + " = " + current.value + "] -> ");
				current = current.next;
			}
			System.out.println("null");
		}
	}


	
	

	public static void main(String[] args) {
		HashMapImplementation map=new HashMapImplementation();
		map.put(10, 1);
		map.put(20, 9);
		map.put(30, 5);
		int k= map.getValue(10);
		System.out.println("The value is :"+k);
		map.deleteByKey(20);
		map.display();
	}
}
