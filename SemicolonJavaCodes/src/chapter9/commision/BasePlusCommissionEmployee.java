package chapter9.commision;

public class BasePlusCommissionEmployee {
	private double baseSalary;
	private CommissionEmployee employee;
	public BasePlusCommissionEmployee(String firstName, String lastName,
	                                  String socialSecurityNumber, double grossSales,
	                                  double commissionRate, double baseSalary) {

		if (baseSalary < 0.0) {
			throw new IllegalArgumentException(
				"Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException(
				"Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}


	public double getBaseSalary() {
		return baseSalary;
	}

	public double earnings() {
		return getBaseSalary() + employee.earnings();
	}

	@Override
	public String toString() {
		return String.format("%s %s%n%s: %.2f", "base-salaried",
			super.toString(), "base salary", getBaseSalary());
	}
}
