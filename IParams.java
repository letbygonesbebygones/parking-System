package git停车场项目;

import java.util.ArrayList;

public interface IParams {
	public int getBig();
	public int getMedium();
	public int getSmall();
	public ArrayList<Integer> getPlanParking();
	public void add(int i);
	public void set(int i, int j, int k);

}
