package tut02;

public class StringExample {
	public static void main(String[] args) {
		String message = "It is pouring like cats and dogs outside";
		
		// We can use the "+" operator to concatenate strings.
		message = message + "and the lightining struck [";
		
		// Add to the string 12 times.
		for (int i = 0; i <= 11; i++) {		
			message = message + i + ",";
		}
		
		message = message + "]";
		System.out.println(message);
		
		// Same example, but using StringBuilder.
		StringBuilder sBuilder = new StringBuilder("It is pouring like cats and dogs outside");
		sBuilder.append("and the lightining struck [");
		for (int i = 0; i <= 11; i++) {		
			sBuilder.append(i).append(",");
		}

		sBuilder.append("]");
		String newMessage = new String(sBuilder);
		System.out.println(newMessage);
	}
}
