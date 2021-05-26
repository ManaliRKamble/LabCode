
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee[] all=new Employee[5];
	Employee emp1=new Employee(10,"Manali","Chinchwad",75000);
	Employee emp2=new Employee(11,"Vijaykumar","Pune",80000);
	Employee emp3=new Employee(12,"Namrata","Kosagi",30000);
	Employee emp4=new Employee(13,"Geeta","Begampur",15000);
	Employee emp5=new Employee(14,"Tejashree","Solapur",15000);
	
	all[0]=emp1;
	all[1]=emp2;
	all[2]=emp3;
	all[3]=emp4;
	all[4]=emp5;
	
	System.out.println("---------------------");
	for(int i=0;i<all.length;i++)
	{
		all[i].display();
	}
//for each
	for(Employee e:all)
	{
		e.display();
	}
	}

}
