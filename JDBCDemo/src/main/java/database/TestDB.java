package database;

import java.sql.SQLException;
import entity.Student;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		
//		DBConnection.dbConn();
		
		boolean insertSuccess;
		
		StudentDatabase db = new StudentDatabase();
		
		for (Student stu:db.getAllStudents())
			System.out.println(stu);

		int i = db.maxStudentID();
		System.out.println("maxStudentID = " + i);
		
		//DB, INSERTION
//		insertSuccess = db.insertStudent(new Student(db.maxStudentID() + 1, "Mills", "Bobby", null));
//		System.out.println(" ---> insertion done: " + insertSuccess);
//		
		//DB, INSERTION (2ND WAY)
//		insertSuccess = db.insertStudent2(new Student(db.maxStudentID() + 1, "Mills", "Lisa", null));
//		System.out.println(" ---> insertion done: " + insertSuccess);
		
		//DB, DATA UPDATE
//		insertSuccess = db.updateStudentByID(1634, "Sparrow", "Ted", "Nicholas");
//		System.out.println(" ---> update done: " + insertSuccess);
		
		//DB, DELETE
//		insertSuccess = db.deleteStudentByID(1632);
//		System.out.println(" ---> deletion done: " + insertSuccess);
		
		//DB, FETCH DATA;
		Student stu = db.getStudentByID(1615);
		System.out.println(" ---> fetch done: " + stu);
		
	
	}

}
