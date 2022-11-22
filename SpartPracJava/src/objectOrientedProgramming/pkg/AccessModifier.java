package objectOrientedProgramming.pkg;


	public class AccessModifier {
	
	    	
	    private void messageInside(){
	    	System.out.println("This is private modifier");
	    }
	    
	    public void messageOutside() {
	    	System.out.println("This is public modifier");
	    	messageInside();
	    	// 상속한 이후에 private 는 다른 메소드를 이용해서 부를 수 있구나 !
	    }
	    protected void messageProtected() {
	    	System.out.println("This is protected modifier ");
	    }
	    void messagePackgePrivate() {
	    	System.out.println("This is messagePakegePrivate");
	    }
	}
	

