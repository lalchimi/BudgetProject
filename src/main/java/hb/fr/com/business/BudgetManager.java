package hb.fr.com.business;

public class BudgetManager {
	int[] depenses;
	int total;
	
	
	//default constructor 
	
	public BudgetManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BudgetManager(int[] depenses) {
		super();
		this.depenses = depenses;
		total = 0;
		for (int i : depenses) {
			total = total + i;
		}
	}
	
	
}
