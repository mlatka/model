package model;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class HourlyEmployee extends Employee
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private double rate;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private double hours;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public HourlyEmployee(){
		super();
	}

	public HourlyEmployee(double rate, double hours) {
		this.rate = rate;
		this.hours = hours;
	}

	@Override
	public double earnings() {
		return 0;
	}

}

