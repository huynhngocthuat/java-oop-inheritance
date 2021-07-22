
public class DataValidator {
	public boolean isEmail(String string) {
		String pattern ="\\w+@\\w+\\.\\w+";
		return string.matches(pattern);
	}
	
	public boolean isPhone(String string) {
		String pattern = "0\\d{9}";
		return string.matches(pattern);
	}
}
