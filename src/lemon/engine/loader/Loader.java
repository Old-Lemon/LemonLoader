package lemon.engine.loader;

public interface Loader<K, T, V> {
	public void add(K item);
	public T getCurrentItem();
	public void load();
	public V get();
	public int getCurrentProgress();
	public int getCurrentTotal();
	public int getProgress();
	public int getTotal();
}
