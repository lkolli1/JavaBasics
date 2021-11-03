package pb;

import patientClinicals.PatientClinicals;
import pr.PatientManagement;

public class PatientBills {
	public static void main(String[] args) {
		PatientManagement pm = new PatientManagement();
		PatientClinicals pc = new PatientClinicals();

		pm.getPatientDetails();
		pc.getPatientClinicalDetails();

	}

}
