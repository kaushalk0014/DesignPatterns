package com.kk.observerpattern;

public interface Subject {
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}
