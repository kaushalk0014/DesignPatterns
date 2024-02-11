package com.kk.observerpattern;

//Client code
public class ObserverPatternExample {
	public static void main(String[] args) {
		// Create a concrete subject
		ConcreteSubject subject = new ConcreteSubject();
		// Create concrete observers
		ConcreteObserver observer1 = new ConcreteObserver();
		ConcreteObserver observer2 = new ConcreteObserver();
		// Add observers to the subject
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		// Set the state of the subject, and observers will be notified
		subject.setState(10);
		// Output:
		// Observer updated. New state: 10
		// Observer updated. New state: 10
		// Remove one observer
		subject.removeObserver(observer1);
		// Set the state again, and only the remaining observer will be notified
		subject.setState(20);
		// Output:
		// Observer updated. New state: 20
	}
}
