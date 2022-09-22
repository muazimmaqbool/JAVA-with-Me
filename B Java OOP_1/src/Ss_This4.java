//Passing this as an Argument
class thisexample{
	int x,y;
	thisexample(int x, int y){
		this.x=x;
		this.y=y;
		
		// value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
        
         // call the add() method passing this as argument
        add(this);
        
        // value of x and y after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
	}
	void add(thisexample j) {
		j.x+=2;
		j.y+=2;	
		}
}
public class Ss_This4 {
	public static void main(String[] args) {
		thisexample obj=new thisexample(1,3);
	}

}
