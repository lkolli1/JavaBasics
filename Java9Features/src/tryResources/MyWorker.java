package tryResources;

public class MyWorker implements AutoCloseable {
	
	MyWorker() {
		System.out.println("Creating the Resource");
	}

	public void doSomething() {
		System.out.println("in Work");
	}

	@Override
	public void close() throws Exception {
		System.out.println("closing Resources");
	}

}
