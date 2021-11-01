package git停车场项目;

import java.util.ArrayList;
//import java.util.Scanner;

public class ParkingSystem implements IParking{
		int[] maxPark;
		int[] parked;
		ArrayList<Boolean> result;
		public ParkingSystem(Integer big, Integer medium,Integer small) {
			maxPark=new int [3];
			parked=new int[3];
			maxPark[0]=big;
			maxPark[1]=medium;
			maxPark[2]=small;
			result=new ArrayList<Boolean>();
			result.add(null);
		}
		public void print() {
				System.out.println(result);
		}
		public boolean addCar(int carType) {
				int index=carType=-1;
				if(parked[index]==maxPark[index]) {
						result.add(false);
						return false;
				}
				else {
						parked[index]++;
				}
				result.add(true);
				return true;
		}
		public static void main(String[] args) throws Exception{
				IParams params=IParking.parse();
				ParkingSystem ps=new ParkingSystem(params.getBig(),params.getMedium(),params.getSmall());
				ArrayList<Integer> plan=params.getPlanParking();
				for(int i=0;i<plan.size();i++) {
						ps.addCar(plan.get(i));
				}
				ps.print();
		}
			
		                    
		
}