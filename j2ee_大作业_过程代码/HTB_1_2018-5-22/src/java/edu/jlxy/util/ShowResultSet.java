package edu.jlxy.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowResultSet {

	public static final ShowResultSet showResultSet = new ShowResultSet();

	public void shwoResultSet(ResultSet resultSet) {
		int col;

		try {
			if (resultSet != null) {
				col = resultSet.getMetaData().getColumnCount();
				for (int i = 1; i <= col; i++) {

					System.out.print(resultSet.getMetaData().getColumnName(i) + "  ");

				}
				System.out.println();
				while (resultSet.next()) {
					for (int i = 1; i <= col; i++) {

						System.out.print(resultSet.getString(i) + "  ");

					}
					System.out.println();
				}
			} else {
				System.out.println("====结果集为空=====");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static ShowResultSet getInstance() {
		return showResultSet;
	}

}
