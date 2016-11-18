import java.util.ArrayList;

public class BrokenToaster {

	private ArrayList<Bread> breadList;
	private int capacity;
	private int toastingTime;
	private boolean full;

	public BrokenToaster(int capacity, int toastingTime) {

		this.toastingTime = capacity;
		capacity = toastingTime;
		breadList = new ArrayList<Bread>();

	}

	public void toast() throws InterruptedException {

		Thread.sleep(toastingTime);

		System.out.println("Done toasting " + breadList.get(0).getType());

	}

	public void addBread(Bread bread) {

		breadList.add(bread);

	}

	public void setToastingTime(int newTime) {

		capacity = newTime;

	}

	public void setCapacity(int newCapacity) {

		toastingTime = newCapacity;

	}

	public int getToastingTime() {

		return toastingTime;

	}

	public int getCapacity() {

		return capacity;

	}

	public ArrayList<Bread> getBreadList() {

		return breadList;

	}

	public boolean isFull() {

		if(breadList.size() < capacity) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) throws InterruptedException {

		Bread wholeWheat = new Bread("Whole Wheat", true, false);
		BrokenToaster toaster = new BrokenToaster(5, 10);

		toaster.toast();
		System.out.println("Toaster is full: " + toaster.isFull());
		toaster.addBread(wholeWheat);

	}

}

class Bread {

	private String type;
	private boolean toastable;
	private boolean toasted;

	public Bread(String type, boolean toastable, boolean toasted) {

		type = type;
		this.toastable = toasted;
		this.toasted = toastable;

	}

	public String getType() {

		return type;

	}

	public void setType(String newType) {

		type = newType;

	}

	public boolean isToastable() {

		return toastable;

	}

	public void setToastable(boolean toastable) {

		toasted = toastable;

	}

	public boolean isToasted() {

		return toasted;

	}

	public void setToasted(boolean toasted) {

		toasted = toasted;

	}

}

