package com.yorku.parkingsystem.user;

import com.yorku.parkingsystem.user.Booking;

public class BillingVisitor implements UserVisitor {

	private final Booking booking;

	public BillingVisitor(Booking booking) {
		this.booking = booking;
	}
	@Override
	public void visit(Student student) {
		System.out.println("Billing Details:");
		System.out.println("Student Name: " + student.getName());

		if (booking != null) {
			booking.showDetails();
		}

	}

	@Override
	public void visit(FacultyMember facultyMember) {
		System.out.println("Billing Details:");
		System.out.println("Faculty Member Name: " + facultyMember.getName());

		if (booking != null) {
			booking.showDetails();
		}

	}

	@Override
	public void visit(NonFacultyMember nonFacultyMember) {
		System.out.println("Billing Details:");
		System.out.println("Non-Faculty Member Name: " + nonFacultyMember.getName());

		if (booking != null) {
			booking.showDetails();
		}

	}

	@Override
	public void visit(Visitor visitor) {
		System.out.println("Billing Details:");
		System.out.println("Visitor Name: " + visitor.getName());

		if (booking != null) {
			booking.showDetails();
		}

	}


}