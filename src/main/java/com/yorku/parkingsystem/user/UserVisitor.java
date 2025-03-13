package com.yorku.parkingsystem.user;
/*
 * interface for the visitor pattern to accept the visitor
 */
public interface UserVisitor {
	void visit(NonFacultyMember nonfacultymember);
	void visit(FacultyMember facultymember);
	void visit(Visitor visitor);
	void visit(Student student);
	
	

}

