module patientclinicals {
	requires transitive patientregistration;//and also static in place of transitive
	exports patientClinicals;
}