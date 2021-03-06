package com.java.dp.observer;

public class ObserverDemo {
	//Reference link : https://www.journaldev.com/1739/observer-design-pattern-in-java
	
	/*Define a one-to-many dependency between objects so that when one object changes state,
	all its dependents are notified and updated automatically.
	
	Benefits:
		It describes the coupling between the objects and the observer.
		It provides the support for broadcast-type communication.
	Usage:
		When the change of a state in one object must be reflected in another object without keeping the objects tight coupled.
		When the framework we writes and needs to be enhanced in future with new observers with minimal changes.

	*/
	public static void main(String[] args) {
		// create subject
		MyTopic topic = new MyTopic();

		//create Observers
		Observer observer1 = new MyTopicSubscriber("observer1");
		Observer observer2 = new MyTopicSubscriber("observer2");
		Observer observer3 = new MyTopicSubscriber("observer3");
		
		//register observers to the subject
		topic.register(observer1);
		topic.register(observer2);
		topic.register(observer3);
		
		//attach observer to subject
		observer1.setSubject(topic);
		observer2.setSubject(topic);
		observer3.setSubject(topic);
		
		//check if any update is available
		observer1.update();
		
		//now send message to subject
		topic.postMessage("New Message to Observer");
	}

}
