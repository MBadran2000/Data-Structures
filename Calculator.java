

	public class Calculator implements ICalculator{
		public int add(int x,int y) {
			return x + y;
	    }
	     
	    public float divide(int x,int y) throws RuntimeException{
	    	if(y != 0)
	    		if(x==0)
	    			return 0;
	    		else
	    			return (float)x / y;
	    	else
	    		throw new RuntimeException("can't divide by zero");
	    	}
	}

