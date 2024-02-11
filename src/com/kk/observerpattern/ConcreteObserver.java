package com.kk.observerpattern;

public class ConcreteObserver implements Observer {
	private int observerState;

	@Override
	public void update(Subject subject) {
		if (subject instanceof ConcreteSubject) {
			ConcreteSubject concreteSubject = (ConcreteSubject) subject;
			observerState = concreteSubject.getState();
			System.out.println("Observer updated. New state: " + observerState);
		}
	}
}
