import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import java.util.function.Predicate;

public class Data {
	int value;
	Data(int value) {
		this.value = value;
	}
	public String toString(){ return " " + value; }

	public void filterData(ArrayList<Data> dataList, Predicate<Data> p) {
	Iterator<Data> i = dataList.iterator();
	while(i.hasNext()) {
			if(p.test(i.next())){
				i.remove();
			}
		}
	}

	public static void main (String[]args){
		ArrayList<Data> a1 = new ArrayList<Data>();
		Data d = new Data(1);
		a1.add(d);
		d = new Data(2); 
		a1.add(d);
		d = new Data(3);
		a1.add(d);

		d.filterData(a1, (Data x) -> x.value% 2== 0 );
	System.out.println(a1);
	}
}


