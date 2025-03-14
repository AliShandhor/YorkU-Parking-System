package com.yorku.parkingsystem.user;

public class BillingVisitor implements UserVisitor {
	
	@Override
	public void visit(NonFacultyMember nonfacultymember) {
		System.out.println("NonFacultyMember: " + nonfacultymember.getName() + " Billing for non faculty member: $" + 10);
	}

	@Override
	public void visit(FacultyMember facultymember) {
		System.out.println("FacultyMember: " + facultymember.getName() + " Billing for faculty member: $" + 8);
	}

	@Override
	public void visit(Visitor visitor) {
		System.out.println("Visitor: " + visitor.getName() + " Billing for visitor: $" + 15);
	}

	@Override
	public void visit(Student student) {
		System.out.println("Student: " + student.getName() + " Billing for student: $" + 5);
	}
}

