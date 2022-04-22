package studyeasyhain;

import java.util.ArrayList;

import javax.sound.midi.Soundbank;

public class ArrayListProgRun {
static	ArrayList<String>listNames=new ArrayList<>();
	public static void main(String[] args) {
		
		System.out.println(listNames);
		listNames.add("ganuu");
		listNames.add("dhanu");
		listNames.add("manu");
		listNames.add("rrrg");
		listNames.add("manus");
		listNames.add("delhi capitals");
		ArrayListProgRun arrayListProgRun=new ArrayListProgRun();
		arrayListProgRun.display(listNames);
		arrayListProgRun.removeNameByPosition(0);
		System.out.println("---------------------");
		arrayListProgRun.display(listNames);
        
		System.out.println("---------------------------------------") ;
       arrayListProgRun.removeNameByString("rrr");
      System.out.println("---------------------");
arrayListProgRun.display(listNames);

System.out.println("-----------------");
boolean b=listNames.contains("manu");
System.out.println(b);
System.out.println(listNames.get(0));
System.out.println(listNames.lastIndexOf("manu"));
System.out.println(listNames.toArray());
listNames.clear();
System.out.println("-----------------");
arrayListProgRun.display(listNames);



	}

	void display(ArrayList<String>listNames)
	{
		for (String name : listNames) {
			System.out.println("after clear arraylist:"+name);
		}
	}
	void	 removeNameByPosition(int position)
		{
			listNames.remove(position);
			
			
		}
	void	 removeNameByString(String name)
	{
		listNames.remove(name);
		
		
	}

	@Override
	public String toString() {
		return "ArrayListProgRun []";
	}

	
	}
	

