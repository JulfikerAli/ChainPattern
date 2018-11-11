package main;

public interface Chain {
	public void setNextChain(Chain nextChain);
	public double calculate(Numbers requests);
	
}
