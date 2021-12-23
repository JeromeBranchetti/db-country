package countries;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	private final static String DB_URL = "jdbc:mysql://localhost:3306/db_nations";
	private final static String DB_USER = "root";
	private final static String DB_PASSWORD = "My5qlpas$";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

		} catch (SQLException e) {
			System.out.println("OOOPS an error occurred");
			System.out.println(e.getMessage());
		}

		scan.close();
	}

	private static Country selectCountryById(Connection con, Scanner scan, int country_id) throws SQLException {
		Country selectedCountry = null;
		String select = "SELECT * FROM countries WHERE id=?;";
		System.out.print("Insert country ID: ");
		int countryId = Integer.parseInt(scan.nextLine());

		try (PreparedStatement psSelect = con.prepareStatement(select)) {
			psSelect.setInt(1, countryId);

			try (ResultSet rsCountry = psSelect.executeQuery()) {

				rsCountry.next();
				Country seleCountry = new Country(rsCountry.getInt(1), rsCountry.getNString(2), rsCountry.getInt(3),
						rsCountry.getDate(4), rsCountry.getString(5), rsCountry.getString(6), rsCountry.getInt(7));

			}

		}
		return selectedCountry;
	}
	
	
	public static LocalDate convertToLocalDateViaSqlDate(Date dateSql) {
		return new java.sql.Date(dateSql.getTime()).toLocalDate();
	}

}
