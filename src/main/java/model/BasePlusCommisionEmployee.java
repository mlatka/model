package model;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class BasePlusCommisionEmployee extends CommissionEmployee
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private double baseSalary;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BasePlusCommisionEmployee(){
		super();
	}


	public BasePlusCommisionEmployee(double commisionRate, double grossSales, double baseSalary) {
		super(commisionRate, grossSales);
		this.baseSalary = baseSalary;
	}
}



