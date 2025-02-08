
public class Application {
	public static void main(String[] args) {
		
		System.out.println("Tutorial 20 - String formattings");
		
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am builder.";
		
		System.out.println(info);
		
		//This is inneficient, and the reason for that is that in java strings are immutable
		// Once you created a string, you can't never change it.
		// Strings in java are immutable, once you create a string, you can't never change it
		// You are not changing the original string, you are creating a new one each time.
		
		
		// to get around this, we have the string builder class. And the way it works is, 
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tammer.");
		
		System.out.println(sb.toString());
		
		// Append method return a reference to the stringbuilder itself.
	
	}
}
