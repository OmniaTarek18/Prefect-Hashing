import java.util.ArrayList;

public interface PerfectHashing<T> {
	public boolean insert(T key);
	public boolean delete(T key);
	public boolean searchForKey(T key);
	public int[] batchInsert(ArrayList<T> elements);
	public int[] batchDelete(ArrayList<T> elements);
	public int getCollisions();
	public int getRebuild();
	ArrayList<T> getAllKeys();
}
