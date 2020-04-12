package test;

import java.util.*;
import java.sql.*;

public class MemberSQL {
	private final int SEL_ID = 1001;
	private final int EDIT_ID_AGE = 2001;
	
	public MemberSQL() {}
	
	public String MemberSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
			case SEL_ID:
				buff.append("SELECT ");
				buff.append("	name, gender ");
				buff.append("FROM ");
				buff.append("	member ");
				buff.append("WHERE ");
				buff.append("	id = ? ");
				break;
				
			case EDIT_ID_AGE:
				buff.append("UPDATE ");
				buff.append("	member ");
				buff.append("SET ");
				buff.append("	age = ? ");
				buff.append("WHERE ");
				buff.append("	id = ? ");
				break;
		}
		return buff.toString();		
	}

	public static void main(String[] args) {
		new MemberSQL();
	}

}
