package G_OtherJavaFeatures;

public class Assignment_GenericAdd<T> {

	private T messsage;

	public T getMesssage() {
		return messsage;
	}

	public void setMesssage(T messsage) {
		this.messsage = messsage;
	}

	public static void main(String[] args) {

		System.out.println("--");

		Assignment_GenericAdd<String> s1 = new Assignment_GenericAdd<String>();
		s1.setMesssage("Hello");
		System.out.println(s1.getMesssage());

		Assignment_GenericAdd<Integer> s2 = new Assignment_GenericAdd<Integer>();
		s2.setMesssage(8975);
		System.out.println(s2.getMesssage());

	}

}
