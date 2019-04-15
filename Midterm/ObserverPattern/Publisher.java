package observerPattern;

public interface Publisher {

	void registerObserver(Worker w);
	void removeObserver(Worker w);
	void notifyObservers();
	
}