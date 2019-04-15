package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WorkManager implements Publisher {
	
	private List<Worker> workers;
	private WorkItem workItem;
	
	public WorkManager() {
		workers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Worker w) {
		workers.add(w);

	}

	@Override
	public void removeObserver(Worker w) {
		workers.remove(w);
	}

	@Override
	public void notifyObservers() {
		WorkItem wi = workItem;
		for (Worker w : workers) {
			if (wi.getItemId() >= 4)
				break;
			wi = w.notify(workItem);
			if (wi != null) {
				System.out.println(String.format("%d: Completed work on WorkItem<%d>", 
						w.getWorkerId(), wi.getItemId() - 1));
			}
		}
	}
	
	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}
}