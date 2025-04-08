package com.yorku.parkingsystem.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserVisitorTest {
    static class TestUserVisitor implements UserVisitor {
        private String lastVisited;

        @Override
        public void visit(NonFacultyMember nonFacultyMember) {
            lastVisited = "NonFacultyMember";
        }

        @Override
        public void visit(FacultyMember facultyMember) {
            lastVisited = "FacultyMember";
        }

        @Override
        public void visit(Visitor visitor) {
            lastVisited = "Visitor";
        }

        @Override
        public void visit(Student student) {
            lastVisited = "Student";
        }

        public String getLastVisited() {
            return lastVisited;
        }
    }

    @Test
    void testVisitNonFacultyMember() {
        NonFacultyMember nonFacultyMember = new NonFacultyMember("Ainaz", "ainaz@yorku.ca", "ainaz123", "C12345678", 10.0);
        TestUserVisitor visitor = new TestUserVisitor();

        visitor.visit(nonFacultyMember);

        assertEquals("NonFacultyMember", visitor.getLastVisited(), "Visitor should visit NonFacultyMember.");
    }

    @Test
    void testVisitFacultyMember() {
        FacultyMember facultyMember = new FacultyMember("Ali", "ali@yorku.ca", "ali456", "B98765432", 8.0);
        TestUserVisitor visitor = new TestUserVisitor();

        visitor.visit(facultyMember);

        assertEquals("FacultyMember", visitor.getLastVisited(), "Visitor should visit FacultyMember.");
    }

    @Test
    void testVisitVisitor() {
        Visitor visitorUser = new Visitor("Dan", "dan@yorku.ca", "dan789", "D98765432", 15.0);
        TestUserVisitor visitor = new TestUserVisitor();

        visitor.visit(visitorUser);

        assertEquals("Visitor", visitor.getLastVisited(), "Visitor should visit Visitor.");
    }

    @Test
    void testVisitStudent() {
        Student student = new Student("Uzma", "uzma@yorku.ca", "uzma321", "A12345678", 5.0);
        TestUserVisitor visitor = new TestUserVisitor();

        visitor.visit(student);

        assertEquals("Student", visitor.getLastVisited(), "Visitor should visit Student.");
    }

    @Test
    void testVisitMultipleUsers() {
        TestUserVisitor visitor = new TestUserVisitor();

        NonFacultyMember nonFacultyMember = new NonFacultyMember("Ainaz", "ainaz@yorku.ca", "ainaz123", "C12345678", 10.0);
        FacultyMember facultyMember = new FacultyMember("Ali", "ali@yorku.ca", "ali456", "B98765432", 8.0);
        Visitor visitorUser = new Visitor("Dan", "dan@yorku.ca", "dan789", "D98765432", 15.0);
        Student student = new Student("Uzma", "uzma@yorku.ca", "uzma321", "A12345678", 5.0);

        visitor.visit(nonFacultyMember);
        assertEquals("NonFacultyMember", visitor.getLastVisited(), "Visitor should visit NonFacultyMember.");

        visitor.visit(facultyMember);
        assertEquals("FacultyMember", visitor.getLastVisited(), "Visitor should visit FacultyMember.");

        visitor.visit(visitorUser);
        assertEquals("Visitor", visitor.getLastVisited(), "Visitor should visit Visitor.");

        visitor.visit(student);
        assertEquals("Student", visitor.getLastVisited(), "Visitor should visit Student.");
    }

    @Test
    void testVisitNonFacultyMemberWithNullValues() {
        NonFacultyMember nonFacultyMember = new NonFacultyMember(null, null, null, null, 0.0);
        TestUserVisitor visitor = new TestUserVisitor();

        visitor.visit(nonFacultyMember);

        assertEquals("NonFacultyMember", visitor.getLastVisited(), "Visitor should visit NonFacultyMember with null values.");
    }

    @Test
    void testVisitFacultyMemberWithEmptyValues() {
        FacultyMember facultyMember = new FacultyMember("", "", "", "", 0.0);
        TestUserVisitor visitor = new TestUserVisitor();

        visitor.visit(facultyMember);

        assertEquals("FacultyMember", visitor.getLastVisited(), "Visitor should visit FacultyMember with empty values.");
    }

    @Test
    void testVisitVisitorWithSpecialCharacters() {
        Visitor visitorUser = new Visitor("D@n", "d@n@yorku.ca", "p@ssw0rd!", "D@98765432", 15.0);
        TestUserVisitor visitor = new TestUserVisitor();

        visitor.visit(visitorUser);

        assertEquals("Visitor", visitor.getLastVisited(), "Visitor should visit Visitor with special characters.");
    }

    @Test
    void testVisitStudentWithLongName() {
        Student student = new Student("UzmaUzmaUzmaUzmaUzma", "uzma@yorku.ca", "uzma321", "A12345678", 5.0);
        TestUserVisitor visitor = new TestUserVisitor();

        visitor.visit(student);

        assertEquals("Student", visitor.getLastVisited(), "Visitor should visit Student with a long name.");
    }

    @Test
    void testVisitStudentWithNegativeRate() {
        Student student = new Student("Uzma", "uzma@yorku.ca", "uzma321", "A12345678", -5.0);
        TestUserVisitor visitor = new TestUserVisitor();

        visitor.visit(student);

        assertEquals("Student", visitor.getLastVisited(), "Visitor should visit Student with a negative rate.");
    }
}