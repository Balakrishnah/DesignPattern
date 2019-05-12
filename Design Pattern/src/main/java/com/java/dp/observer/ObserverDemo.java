package com.java.dp.observer;

public class ObserverDemo {
	/*Reference link : https://www.journaldev.com/1739/observer-design-pattern-in-java
	 Observer Pattern is one of the behavioral design pattern. Observer design pattern is useful 
	 when you are interested in the state of an object and want to get notified whenever there is any change. 
	 In observer pattern, the object that watch on the state of another object are called Observer and
	  the object that is being watched is called Subject.	 
*/	
	/*Define a one-to-many dependency between objects so that when one object changes state,
	all its dependents are notified and updated automatically.*/
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
