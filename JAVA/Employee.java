
public class Employee {
		int id;
		String name;
		String Add;
		int sal;
		public Employee(int id,String name,String Add,int sal)
		{
			this.id=id;
			this.name=name;
			this.Add=Add;
			this.sal=sal;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAdd() {
			return Add;
		}
		public void setAdd(String add) {
			Add = add;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
		public void display()
		{
			System.out.println("Id="+id);
			System.out.println("Name="+name);
			System.out.println("Address="+Add);
			System.out.println("Salary="+sal);
		}
		
}
