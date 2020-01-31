package Q2;


public class InvalidSubscriptException extends RuntimeException
{
	// no-argument constructor
	public InvalidSubscriptException()
	{
		this("Invalid subscript.");
	} 

	// one-argument constructor
	public InvalidSubscriptException(String message)
	{
		super(message);
	} 

	// two-argument constructor
	public InvalidSubscriptException(String message, Throwable cause)
	{
		super(message, cause);
	} 
}
