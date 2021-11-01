package git停车场项目;
import java.util.ArrayList;
public class Params {
	ArrayList<Integer> initValues;
	ArrayList<Integer> args;
	public Params() {
			this.initValues=new ArrayList<Integer>();
			this.args=new ArrayList<Integer>();
	}
	public void configCapacity(int val) {
			this.initValues.add(val);
	}
	public void planParking(int carType) {
			args.add(carType);
	}
	public int getBig() {
		return initValues.get(0);
	}
	public int getMedium() {
		return 0;}
	public int getSmall(){
		return 0;}
	public ArrayList<Integer> getPlanParking(){
			return args;
	}	
}
