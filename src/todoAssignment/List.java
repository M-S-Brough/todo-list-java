package todoAssignment;

public interface List {

	public void add(Object obj);

	public void add(int index, Object obj);

	public Object get(int index);

	public int size();

	public boolean isEmpty();

	public boolean isIn(Object ob);

	public int find(Object n);

	public void remove(Object n);

}
